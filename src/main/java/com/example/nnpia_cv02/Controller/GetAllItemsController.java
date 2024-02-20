package com.example.nnpia_cv02.Controller;

import com.example.nnpia_cv02.Person;

import java.util.HashMap;

public class GetAllItemsController {
    public void getAllItems(HashMap<Integer, Person> personMap) {
        System.out.println("Všechny položky v HashMap:");
        for (Person p : personMap.values()) {
            System.out.println("ID: " + p.getId() + ", name: " + p.getName() + ", surname: " + p.getSurname());
        }
    }
}
