package com.example.nnpia_cv02;

import com.example.nnpia_cv02.Controller.GetAllItemsController;
import com.example.nnpia_cv02.Controller.GetItemByIdController;
import com.example.nnpia_cv02.Controller.HelloController;
import com.example.nnpia_cv02.Services.myService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class NnpiaCv02Application {

	@Autowired
	private myService greetingService;

	public static void main(String[] args) {
		Person p1 = new Person(1, "Jmeno", "Prijmeni");
		Person p2 = new Person(2, "Hadej", "Kdo");
		Person p3 = new Person(3, "Grinch", "NesnasiVanoce");

		HashMap<Integer, Person> peopleMap = new HashMap<Integer, Person>();
		peopleMap.put(p1.getId(), p1);
		peopleMap.put(p2.getId(), p2);
		peopleMap.put(p3.getId(), p3);

		GetAllItemsController getAllItemsController = new GetAllItemsController();
		GetItemByIdController getItemByIdController = new GetItemByIdController();
		
		getAllItemsController.getAllItems(peopleMap);
		getItemByIdController.getItemById(peopleMap, 2);

		SpringApplication.run(NnpiaCv02Application.class, args);
	}

}
