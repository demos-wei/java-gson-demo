package com.example.gson.entity;

import com.google.gson.annotations.Expose;

public class Animal {

  @Expose
  private final String name;

  private final String type;

  public Animal(String name, String type) {
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    return new StringBuilder().append("User{").append("name: ")
        .append(name).append(",type: ")
        .append(type).append("}").toString();
  }
}
