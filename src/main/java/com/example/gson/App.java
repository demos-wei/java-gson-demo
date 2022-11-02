package com.example.gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.example.gson.entity.Animal;
import com.example.gson.entity.Person;
import com.example.gson.entity.TimeData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class App {

  public static void gsonToJson() {
    Gson gson = new Gson();
    Person person = new Person("wei", "zeng");
    System.out.println(gson.toJson(person));
  }

  public static void jsonToGson() {
    Gson gson = new Gson();
    String personJsonString = "{\"firstName\":\"lebron\", \"lastName\": \"james\"}";
    System.out.println(gson.fromJson(personJsonString, Person.class));
  }

  public static void serializerWithoutExpose() {
    Gson gson = new GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .setPrettyPrinting()
        .create();
    Animal animal = new Animal("Tom", "cat");
    System.out.println(gson.toJson(animal));
  }

  public static void gsonReadWebPage() {
    String webPage = "http://time.jsontest.com";
    try (
        InputStream is = new URL(webPage).openStream();
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)
    ) {

      Gson gson = new Gson();
      TimeData td = gson.fromJson(reader, TimeData.class);

      System.out.println(td);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void gsonArrayToJsonArray() {
    ArrayList<Person> personArrayList = new ArrayList();
    personArrayList.add(new Person("kobe", "bryant"));
    personArrayList.add(new Person("michael", "jordan"));
    Gson gson = new Gson();
    System.out.println(gson.toJson(personArrayList));
  }

  public static void JsonArrayToGsonArray() {
    String jsonString = "[{\"firstName\":\"kobe\",\"lastName\":\"bryant\"}," +
        "{\"firstName\":\"michael\",\"lastName\":\"jordan\"}]";
    Gson gson = new Gson();
    ArrayList<Person> personArrayList = gson.fromJson(
        jsonString, new TypeToken<ArrayList<Person>>(){}.getType()
    );
    System.out.println(personArrayList);
  }

  public static void main(String[] args) {
    App.gsonToJson();
    App.jsonToGson();
    App.serializerWithoutExpose();
    App.gsonReadWebPage();
    App.gsonArrayToJsonArray();
    App.JsonArrayToGsonArray();
  }
}
