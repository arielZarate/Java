package com.upskillingjava.crud.repositories;

import com.upskillingjava.crud.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


@Repository
//@Transactional  //aplica Transactional a toda la clase entera pero no discrimina por metodos
public class UserDaoImpl implements UserDAO{

    @PersistenceContext  // opcion 1 automatica inyecta la dependencia y maneja la UP automaticamente
    private EntityManager em;


    //========esta es la ocpion 2 ====================
 /*
 *    public UserDaoImpl(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("unidad de persistencia");
        this.em=emf.createEntityManager();

    }
 * */
 //================fin de opcion2 ================================

    @Override
    public List<User> findAll() {
        try {
            return em.createQuery("SELECT u FROM User u", User.class).getResultList();
        } catch (Exception e) {
            // Manejo de excepciones, por ejemplo, logueo del error
            System.err.println("Error al obtener todos los usuarios: " + e.getMessage());
            throw new RuntimeException("Error al obtener todos los usuarios", e);

        }
    }

    @Override
    @Transactional
    public Optional<User> findById(Long id) {
        try {
            User user= em.find(User.class, id);
            return Optional.ofNullable(user);
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Error al encontrar el usuario con ID " + id + ": " + e.getMessage());
            throw new RuntimeException("Error al encontrar el usuario", e);
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        try {
//otra opcion es    User user = em.getReference(User.class, id);
            User user=em.find(User.class,id);
            if(user != null)
            {
                em.remove(user);
               // return true;
            }
           //en caso de no encontrarse el user a eliminar
            //return false;
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Error al eliminar el usuario con ID " + id + ": " + e.getMessage());
            throw new RuntimeException("Error al eliminar el usuario", e);
        }
    }

    @Override
    @Transactional
    public User create(User user) {
        try {
            em.persist(user);
            // Devuelve el usuario con el ID generado
            return user;
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Error al crear el usuario: " + e.getMessage());
            throw new RuntimeException("Error al crear el usuario", e);
        }
    }

    @Override
    @Transactional
    public User update(User user) {
        try {
            return em.merge(user);
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Error al actualizar el usuario : " + e.getMessage());
            throw new RuntimeException("Error al actualizar el usuario", e);
        }
    }
}





  /*

  ======  //ejemplo de como seria con transacciones manualmente . para recordar=============


  *   @Override
    public void update(long id, User user) {
        EntityManager entityManager=emf.createEntityManager();

            entityManager.getTransaction().begin();
            //para actualizar buscar el user primero

            User user_found=entityManager.find(User.class,id);
            if(user_found !=null)
            {
                //ahora seteamos el user si existe
                user_found.setName(user.getName());
                user_found.setLastName(user.getLastName());
                user_found.setAge(user.getAge());
                user_found.setEmail(user.getEmail());
            }

            entityManager.getTransaction().commit();

    }
  * */