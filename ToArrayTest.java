package hackveda.bhavesh.firstProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ToArrayTest {
	
	public static void main(String[] arags) {
		
		 ArrayList<String> partyGuests = new ArrayList<String>();
		 
		 partyGuests.add("David");
		 partyGuests.add("John");
		 partyGuests.add("Nick");
		 partyGuests.add("Sam");
		 
		 Object[] arrayGuests = partyGuests.toArray();
		 
		 System.out.println("Element at Index 0 for Array: " + arrayGuests[0]);
		 System.out.println("Element at Index 0 for Array: " + arrayGuests[1]);
		 System.out.println("Element at Index 0 for Array: " + arrayGuests[2]);
		 System.out.println("Element at Index 0 for Array: " + arrayGuests[3]);
		
		 System.out.println("HashCode of the array: " + arrayGuests.hashCode());
		 
	}

}