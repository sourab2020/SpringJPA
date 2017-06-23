package com.trng.springJPA.SpringJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  

  @NotNull
  private String email;
  

  public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

@NotNull
  private String name;
  
  @NotNull
  private Integer age;


  public User() { }

  public User(long id) { 
    this.id = id;
  }
  
  public User(String email, String name,Integer age) {
    this.email = email;
    this.name = name;
    this.age=age;
  }


  public long getId() {
    return id;
  }

  public void setId(Long value) {
    this.id = value;
  }

  public String getEmail() {
    return email;
  }
  
  public void setEmail(String value) {
    this.email = value;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }
  
} 
