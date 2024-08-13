# CRUD SPRINGBOOT 


## dependencias

- mysql-connector
- spring-web
- spring-data-jpa 

```html
<dependencies>
		<!-- Starter para aplicaciones web (incluye Spring MVC, Tomcat, etc.) -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<!-- Starter para JPA (incluye Hibernate como el proveedor de JPA) -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>



		<!-- Conector de MySQL -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.33</version>
		</dependency>

		<!-- Starter para pruebas -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```



## Estructura del proyecto aproximada 

```bash
com.upskillingjava.crud
│
├── controllers
│   ├── BaseController.java
│   ├── UserController.java
│   ├── otroController.java
│   └── ...
│
├── models
│   ├── User.java
│   ├── otro.java
│   └── ...
│
├── services
│   ├── UserService.java
│   ├── otroService.java
│   └── ...
│
└── repositories
    ├── UserDAO.java
    ├── otroDAO.java
    └── ...

```


## Capas de modularizacion

### 1. Separación de Responsabilidades:
   - Model -> User : es la entidad.
   - DAO: Solo debe manejar la interacción con la base de datos. No debe realizar validaciones ni manejar lógica de negocio.
     Dado que el DAO no debería realizar ninguna validación, solo necesita recibir los objetos User y 
     manejar las operaciones CRUD directamente. No necesitas pasar el id en el método update dentro del DAO 
     porque la responsabilidad de encontrar el usuario y validar su existencia antes de la actualización 
     debería estar en el Service.
    
   ```java
   package com.upskillingjava.crud.repositories;

    import com.upskillingjava.crud.models.User;
    import java.util.List;
    import java.util.Optional;

    public interface UserDAO {
    List<User> findAll();
    Optional<User> findById(Long id);
    void delete(Long id);
    void create(User user);
    void update(User user);
    }
    
   ```
            

             
   ```java 
    package com.upskillingjava.crud.repositories;

    import com.upskillingjava.crud.models.User;
    import jakarta.persistence.EntityManager;
    import jakarta.persistence.PersistenceContext;
    import jakarta.transaction.Transactional;
    import org.springframework.stereotype.Repository;
    import java.util.List;
    import java.util.Optional;

    @Repository
    public class UserDaoImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> findAll() {
        try {
            return em.createQuery("SELECT u FROM User u", User.class).getResultList();
        } catch (Exception e) {
            System.err.println("Error al obtener todos los usuarios: " + e.getMessage());
            throw new RuntimeException("Error al obtener todos los usuarios", e);
        }
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        try {
            User user = em.find(User.class, id);
            return Optional.ofNullable(user);
        } catch (Exception e) {
            System.err.println("Error al encontrar el usuario con ID " + id + ": " + e.getMessage());
            throw new RuntimeException("Error al encontrar el usuario", e);
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        try {
            User user = em.find(User.class, id);
            if (user != null) {
                em.remove(user);
            } else {
                System.err.println("No se encontró el usuario con ID " + id + " para eliminar.");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar el usuario con ID " + id + ": " + e.getMessage());
            throw new RuntimeException("Error al eliminar el usuario", e);
        }
    }

    @Override
    @Transactional
    public void create(User user) {
        try {
            em.persist(user);
        } catch (Exception e) {
            System.err.println("Error al crear el usuario: " + e.getMessage());
            throw new RuntimeException("Error al crear el usuario", e);
        }
    }

    @Override
    @Transactional
    public void update(User user) {
        try {
            em.merge(user);
        } catch (Exception e) {
            System.err.println("Error al actualizar el usuario: " + e.getMessage());
            throw new RuntimeException("Error al actualizar el usuario", e);
        }
    }
    }

   ```
   - Service: Debe manejar la lógica de negocio, incluyendo validaciones y cualquier otra lógica antes de llamar al DAO.
    
     ```java
        package com.upskillingjava.crud.services;


        import com.upskillingjava.crud.models.User;
        import com.upskillingjava.crud.repositories.UserDAO;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        
        import java.util.List;
        import java.util.Optional;
        
        @Service   //debe estar puesto esta anitacion sino no inytectara la dependencia
        public class UserService {

        private final UserDAO userDAO;

        @Autowired
        public UserService(UserDAO userDAO) {
            this.userDAO = userDAO;
        }

        public List<User> findAll() {
            return userDAO.findAll();
        }

        public Optional<User> findById(Long id) {
            Optional<User> user_opt = userDAO.findById(id);
            // devuelve el optional tal como lo recibe el DAO
            return user_opt;
        }

        public User  create(User user) {

            //aqui puedo validar el usuario
             return  userDAO.create(user);


        }

        public User update(Long id, User user) {
            Optional<User> exist_user = findById(id);
            if (exist_user.isEmpty()) {
                throw new RuntimeException("User not found with ID" + id);
            }
            user.setId(id); // Seteamos el ID al usuario antes de la actualización
            return userDAO.update(user);

        }

        public void delete(Long id) {
            Optional<User> exist_user=findById(id);
            if(exist_user.isPresent())
            {
                userDAO.delete(id);
            }else { throw new RuntimeException("User not found with ID " + id);
            }

        }

    }
     ```
  - Controller: Se encarga de manejar las solicitudes HTTP y delegar la lógica al servicio

   ```java  

package com.upskillingjava.crud.controllers;



import com.upskillingjava.crud.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.upskillingjava.crud.models.User;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users =userService.findAll();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        // Crea un nuevo usuario y devuelve con código de estado 201 Created
        User createdUser= userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id , @RequestBody User user ){

        try {
            User updatedUser = userService.update(id, user);
            return ResponseEntity.ok(updatedUser);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {

        try {
            userService.delete(id);
            return ResponseEntity.ok("User with ID " + id + " was successfully deleted.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }
}

   ```


### 2. Uso de JPA y Spring:

Estás utilizando JPA con Hibernate y Spring para la gestión de la persistencia, 
lo cual es una buena práctica para simplificar las operaciones CRUD.



### 3. Manejo de Excepciones:

Tienes manejo de excepciones en el DAO y servicio, lo cual ayuda a mantener la robustez del sistema.

### 4. Configuración:

La configuración de la base de datos y JPA en application.properties está bien establecida.

```properties

# GENERAL
server.port=3000
#
spring.application.name=crud



# DATABASE
spring.datasource.url=jdbc:mysql://localhost:3306/parking?useSSL=false
#spring.datasource.dbname=parking
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


# JPA CONFIGURATION

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

```



## Cómo Ejecutar
- Clona este repositorio.
- Asegúrate de tener MySQL corriendo y la base de datos configurada.
- Ejecuta el proyecto con mvn spring-boot:run o desde tu IDE.
