package com.arielZarate.springSecurityJwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.arielZarate.springSecurityJwt.entity.AuthDetailModel;
import com.arielZarate.springSecurityJwt.entity.User;
import com.arielZarate.springSecurityJwt.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;



  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Optional<User> user = this.userRepository.findByEmail(email);
    // return new AuthDetailModel(user);
    AuthDetailModel authDetail = user.map(AuthDetailModel::new)
        .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + email));
    
        return authDetail;
  }



}
