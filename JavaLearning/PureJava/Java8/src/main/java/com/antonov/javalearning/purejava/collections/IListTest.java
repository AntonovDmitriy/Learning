package com.antonov.javalearning.purejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class IListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arrStr = { "One", "Two" };
		List<String> listStr = Arrays.asList(arrStr);
		List<String> listStrModifiable = new ArrayList(listStr);
		try {
			listStr.add("Third");
		} catch (UnsupportedOperationException ex) {
			System.out.println("В лист, полученный из массива, нельзя ни вставлять ни удалять элементы");
		}

		// А вот переставлять элементы можно
		Collections.shuffle(listStr);
		System.out.println(listStr);

		// Помимо стандартного Iterator в интерфейс List входит ListIterator, который позволяет ходить в обе стороны
		// У него есть две формы. Одна без аргументов, итератор начинается с начала листа
		ListIterator<String> listIterator = listStr.listIterator();
		// Есть форма с индексом, где индекс обозначает позицию итератора. Причем например для аргумента 1 next() будет выдавать элемент с индексом 1 
		// а previous с индексом 0
		
		ListIterator<String> listIteratorStartWith = listStr.listIterator(listStr.size()-1);
		listStr.listIterator();
		// У ListItarator есть методы add() и set() которые вставляют или замещают элемент
		// перед тем, который должне вернуть next() или после элемента previous()
	
		
		// Интересный метод sublist. Возвращает лист, изменения в котором автоматически завтрагивают родительский лист.
		System.out.println(listStrModifiable);
		List<String> subList = listStrModifiable.subList(0, listStr.size());
		
		
		// Делать операции с подлистом безопасно
		subList.set(0, "Another");
		System.out.println(subList);
		System.out.println(listStrModifiable);
		subList.add("Third)");
		System.out.println(subList);
		System.out.println(listStrModifiable);
		subList.remove(0);
		System.out.println(subList);
		System.out.println(listStrModifiable);
		
		
		// Делать операции с начальным листом небезопасно. Операции затрагивающие изменения размера могу вызвать исключение
		listStrModifiable.set(0, "Another");
		System.out.println(listStrModifiable);
		System.out.println(subList);
		listStrModifiable.add("Third)");
		System.out.println(listStrModifiable);
		System.out.println(subList);
		listStrModifiable.remove(0);
		System.out.println(listStrModifiable);
		System.out.println(subList);
		
		
	}
}
