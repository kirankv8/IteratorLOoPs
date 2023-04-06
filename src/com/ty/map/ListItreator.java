package com.ty.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListItreator {

	public static void main(String[] args) {

		List<Employee> e1 = new ArrayList<>();
		Employee a1 = new Employee(1, "kiran", "kiran@gmail.com", 9611180037l);
		e1.add(a1);
		e1.add(new Employee(2, "mihir", "mihir@gmail.com", 886979779879l));
		e1.add(new Employee(3, "ashutosh", "ashu@gmail.com", 88677979l));
		e1.add(new Employee(4, "pratham", "pratham@gmail.com", 978696929l));
		System.out.println("Iteration of list ");
		for (Employee emp : e1) {
			System.out.println(emp);

		}
		System.out.println();
		System.out.println("sterams usage in  collections");
		List<Employee> emp1 = e1.stream().map(employee -> employee).collect(Collectors.toList());
		System.out.println(emp1);
		System.out.println("collection the data by filtering");
		List<String> e3 = e1.stream().filter(employee -> employee.getEmail().contains("ashu@gmail.com"))
				.map(p -> p.getEmail()).collect(Collectors.toList());
		System.out.println(e3);
	}
}
