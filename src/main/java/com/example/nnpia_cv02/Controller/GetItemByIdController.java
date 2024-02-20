package com.example.nnpia_cv02.Controller;

import com.example.nnpia_cv02.Person;

import java.util.HashMap;

public class GetItemByIdController {
    public void getItemById(HashMap<Integer, Person> itemsMap, int id) {
        Person item = itemsMap.get(id);
        if (item != null) {
            System.out.println("Person with ID " + id + " found:");
            System.out.println("name: " + item.getName() + ", surname: " + item.getSurname());
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }
}
