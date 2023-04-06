package com.ty.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer, Employee> m1 = new HashMap<>();
		m1.put(2, new Employee(2, "mihir", "mihir@gmail.com", 886979779879l));
		m1.put(3, new Employee(3, "ashutosh", "ashu@gmail.com", 88677979l));
		m1.put(4, new Employee(4, "pratham", "pratham@gmail.com", 978696929l));
		System.out.println("map" + m1);
		System.out.println("iteration of map");

		for (Map.Entry<Integer, Employee> ok : m1.entrySet()) {
			System.out.println(ok.getKey() + ", " + ok.getValue());
		}

		System.out.println("getting values");
		m1.entrySet().stream().map(Map.Entry::getValue).forEach(System.out::println);
		
		System.out.println("iterating map..");
		m1.forEach((key, value) -> System.out.println(key + " ," + value));

	}
}
