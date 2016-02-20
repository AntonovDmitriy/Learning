package com.antonov.javalearning.purejava.collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ICollectionTest {

	public static class Employee {

		private Color color;
		private int salary;
		private String name;

		public Employee(Color color, int salary, String name) {
			this.color = color;
			this.salary = salary;
			this.name = name;
		}

		public Employee(String name) {
			this.name = name;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj != null) {
				return ((Employee) obj).getName().equals(getName());
			} else {
				return false;
			}
		}

		@Override
		public String toString() {

			return getName() + " " + getSalary();
		}
	}

	public static Collection<String> getTestStringCollection() {

		Collection<String> colString = new ArrayList<>();
		colString.add("first");
		colString.add("second");
		colString.add("third");
		return colString;
	}

	public static Collection<Employee> getTestEmployeeCollection() {
		Collection<Employee> colEmp = new ArrayList<>();
		colEmp.add(new Employee(Color.RED, 10, "Иван"));
		colEmp.add(new Employee(Color.BLACK, 20, "Ольга"));
		colEmp.add(new Employee(Color.GREEN, 30, "Василий"));
		colEmp.add(new Employee(Color.BLACK, 3, "Евгений"));
		colEmp.add(new Employee(Color.GREEN, 30, "Василий"));
		colEmp.add(null);
		colEmp.add(null);
		return colEmp;
	}

	public static void main(String[] args) {

		Collection<String> colString = getTestStringCollection();
		Collection<Employee> colEmp = getTestEmployeeCollection();

		// Начиная с Java 8 рекомендуется использовать stream при работе с
		// коллекциями

		// Получаем поток стрингов из потока обьектов и соединяем результат в
		// строку
		String st = colString.stream().map(Object::toString).collect(Collectors.joining(","));
		System.out.println(st);

		// Отфильтруем рабочих по черному цвету и выведем их имена
		colEmp.stream().filter(e -> e != null && e.getColor() == Color.BLACK)
				.forEach(e -> System.out.println(e.getName()));

		// Проссумируем запрлаты всех сотрудников
		System.out.println(colEmp.stream().filter(e -> e != null).collect(Collectors.summingInt(Employee::getSalary)));

		// Удалим всех Василиев из коллекции
		System.out.println(colEmp.toString());
		colEmp.removeAll(Collections.singleton(new Employee("Василий")));
		System.out.println(colEmp.toString());

		// Удалим все null из коллекции
		colEmp.removeAll(Collections.singleton(null));
		System.out.println(colEmp.toString());

		// Преобразуем коллекцию в массив
		// ВАЖНО можно писать 0 в размере массива
		Employee[] arrayEmp = colEmp.toArray(new Employee[0]);
		System.out.println(Arrays.toString(arrayEmp));

		// Для изменения текущей коллекции, а именно удаление специфических
		// элементов нужно применять
		// толко remove через Iterator. При итерации другие поведение других
		// методов не может быть гарантированным
		// поэтому цикл for each не подходит для этих целей. Если нужно удалить
		// элементы при обхода пишем так

		for (Iterator<Employee> it = colEmp.iterator(); it.hasNext();) {
			if (it.next().getColor() == Color.BLACK) {
				it.remove();
			}
		}
		System.out.println(colEmp.toString());

		// интересный метод retainAll. Он удаляет все элементы из текущей
		// коллекции, которые не равны элементы
		// коллекции в аргументе

	}

}
