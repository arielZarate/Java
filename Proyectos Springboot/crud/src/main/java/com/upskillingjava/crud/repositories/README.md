## Detalle

en este repositorio deje detalle que puedo usar 2 formas para crear un repositorio de User 

1. Creando una interface DAO y luego implementarla 

```java

package com.upskillingjava.crud.repositories;


import com.upskillingjava.crud.models.User;

import java.util.List;


public interface UserDAO {


    public List<User> findAll();

    public User findById(Long id);

    public void delete(Long id);

    public void  create(User user);

    public void  update(Long id, User user);

    
}

```

```java
package com.upskillingjava.crud.repositories;

import com.upskillingjava.crud.models.User;

import java.util.List;

public class UserDaoImpl implements UserDAO{
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void update(Long id, User user) {

    }
}


```

2. creando una interface userRepository extendiendo de JpaRepository

```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
    Optional<User> findByEmail(String email);
    // Otros métodos personalizados si es necesario
}


```