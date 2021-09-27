package hackveda.bhavesh.firstProject;

import java.util.ArrayList;

public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		myArrayList.add(1); // 0
		myArrayList.add(2); // 1
		myArrayList.add(3); // 2
		myArrayList.add(4); // 3
		myArrayList.add(5); // 4
		myArrayList.add(6); // 5
		
		System.out.println("Printing List 1");
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList.get(0));
		System.out.println(myArrayList.get(5));
		
		//removing element 
		myArrayList.remove(5);
		//checking if element is removed
		System.out.println(myArrayList.contains(6));
		
		System.out.println("Updating Element");
		myArrayList.add(1, 6);
		
		System.out.println(myArrayList.get(1));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(myArrayList);
		
		System.out.println("Printing List 2");
		System.out.println(list2.get(1));
		System.out.println(list2.get(0));
		System.out.println(list2.get(4));
		
		list2.clear();
		
		try {
		System.out.println("Printing List 2");
		System.out.println(list2.get(1));
		System.out.println(list2.get(0));
		System.out.println(list2.get(4));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("List is cleared");
		}
		
		ArrayList<Integer> myArrayListClone = (ArrayList<Integer>) myArrayList.clone();
		
		System.out.println("Clear the myArrayList after cloning");
		myArrayList.clear();
		
		System.out.println("Printing from MyArrayList Clone");
		System.out.println(myArrayListClone.get(1));
		System.out.println(myArrayListClone.get(0));
		System.out.println(myArrayListClone.get(4));
		
		System.out.println("Check if myArrayListClone contains 6");
		
		boolean result = myArrayListClone.contains(6);
		
		if(result) {
			System.out.println("Item Exists");
		}else {
			System.out.println("Item Doesnt Exists");
		}
		System.out.println(myArrayListClone.isEmpty());
		
		//printing sublist
		System.out.println(myArrayListClone.subList(0, 5));

	}


}


