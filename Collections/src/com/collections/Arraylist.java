package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {
	public static void main(String[] args)
	{
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(40);
		al.add(200);
		al.add(31);
		al.add(300);
		al.add(100);
		
		Iterator itr = al.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
