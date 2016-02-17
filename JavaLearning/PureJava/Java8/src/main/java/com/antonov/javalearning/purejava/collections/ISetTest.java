package com.antonov.javalearning.purejava.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.antonov.javalearning.purejava.collections.ICollectionTest.Employee;

public class ISetTest {

	public static void main(String[] args) {

		// Устранить дубликаты из коллекции, используя конструктор коллекции
		Collection<Employee> colEmp = ICollectionTest.getTestEmployeeCollection();
		System.out.println(colEmp);
		Collection<Employee> colEmpWithoutDups = new HashSet<>(colEmp);
		System.out.println(colEmpWithoutDups);

		// другой способ, с использованием stream
		colEmpWithoutDups = colEmp.stream().collect(Collectors.toSet());
		System.out.println(colEmpWithoutDups);

		//а как сохранить порядок изначальной коллекции и устранить дубликаты
		colEmpWithoutDups = colEmp.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(colEmpWithoutDups);
		colEmpWithoutDups = new LinkedHashSet<>(colEmp);
		System.out.println(colEmpWithoutDups);
		
		// Если хотим получить реализации конкретной коллекции из stream. Имена
		// по алфавиту
		Collection<String> colNames = colEmp.stream().filter(e -> e != null).map(Employee::getName)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(colNames);
		
		//сравнить retainAll в collection и имплементацию в Set. anotherTestEmpcollection
		// прочитать Collection  Set в javadoc
		
	}

}
