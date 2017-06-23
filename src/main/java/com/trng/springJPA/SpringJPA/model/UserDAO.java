package com.trng.springJPA.SpringJPA.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDAO extends CrudRepository<User, Long> {


  public User findByEmail(String email);
  
  public User findByAge(Integer age);
  
  public Iterable<User> findAll();
}