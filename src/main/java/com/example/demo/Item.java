package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
  
  @Id @GeneratedValue
  private Long id;
  private String name;
  public Item() {}
  public Item(String name) {
    this.name = name;
  }
  public Long getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  
  @Override
  public String toString() {
    return name;
  }
  
}
