package com.example.gson.entity;

public class Person {
  private final String firstName;
  private final String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return new StringBuilder().append("User{").append("firstName: ")
        .append(firstName).append(", lastName: ")
        .append(lastName).append("}").toString();
  }
}
