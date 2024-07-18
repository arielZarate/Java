package capa_negocio;

import capa_datos.User;
import capa_persistencia.UserDAO;

import java.util.List;

public class UserService implements UserServiceDAO{


   private final UserDAO  userDAO;


   //constructor  inyeccion de dependencias
    public UserService(UserDAO userDao) {
        userDAO = userDao;
    }


    @Override
    public List<User> getAllUser() {
        return  userDAO.findAll();
    }

    @Override
    public Long createUser(User user) {
       return userDAO.create(user);
    }

    @Override
    public User findUserById(Long id) {
        return  userDAO.findById(id);
    }

    @Override
    public int updateUser(Long id, User user) {
        return userDAO.update(id,user);
    }

    @Override
    public int deleteUser(long id) {
        return userDAO.delete(id);
    }
}
