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
