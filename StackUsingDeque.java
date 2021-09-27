package hackveda.bhavesh.firstProject;

import java.util.*;

public abstract class StackUsingDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayDeque<String> myDeque = new ArrayDeque<String>();
		
		myDeque.add("Devanshu");
		
		myDeque.addFirst("Bhavesh");
		
		myDeque.addLast("New Person");
		
		myDeque.offerFirst("Salman");
		
		myDeque.offer("Sharukh");
		
		
		System.out.println("First Element: " + myDeque.getFirst());
		
		System.out.println("Last Element: " + myDeque.getLast());
		
		System.out.println("Deque contains Bhavesh: " + myDeque.contains("Bhavesh"));
		
		System.out.println("Iterating all elements in descending order");
		
		Iterator<String> myIterator = myDeque.descendingIterator();
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}

	}

}
