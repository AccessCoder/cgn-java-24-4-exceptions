package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class StudentRepo {

    Map<String, String> students = new HashMap<>();

    public String getStudentById(String id) throws Exception {
       if (students.containsKey(id)){
           return students.get(id);
       }else {
           throw new Exception("Element with Id: " + id + " not found!");
       }

    }
}
