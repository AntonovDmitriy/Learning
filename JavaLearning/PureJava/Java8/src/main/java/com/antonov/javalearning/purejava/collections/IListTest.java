package com.antonov.javalearning.purejava.collections;

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
	
	}
}
