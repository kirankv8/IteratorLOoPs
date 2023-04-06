package com.ty.map;

import java.util.stream.Stream;

public class ArrayIteratn {
	public static void main(String[] args) {
		System.out.println("iterating the array using the for loop");
		System.out.println();
		Employee emps[] = { new Employee(1, "mihir", "mihir@gmail.com", 886979779879l),
				new Employee(1, "kiran", "kiran@gmail.com", 9611180037l),
				new Employee(3, "ashutosh", "ashu@gmail.com", 88677979l),
				new Employee(4, "pratham", "pratham@gmail.com", 978696929l) };

		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
		}
		System.out.println();
		System.out.println("Iteration of array using the streams ");
		System.out.println();
		Stream<Employee> ar1 = Stream.of(emps);
		ar1.forEach(System.out::println);
		System.out.println();
		System.out.println("Iteration of array using the enhancement loop ");
		System.out.println();
		for (Employee em : emps) {
			System.out.println(em);
		}
	}
}
