package com.upskillingjava.crud.repositories;


import com.upskillingjava.crud.models.User;

import java.util.List;
import java.util.Optional;


public interface UserDAO {

    //he llegado a esta logica quew me parece la mas optima, el service valida todo

    public List<User> findAll();

    public Optional<User> findById(Long id);


    // podria devolver el usario eliminado o un booleano o void como hago
    public void delete(Long id);

    public User  create(User user);

    public User  update(User user);

    //

}
