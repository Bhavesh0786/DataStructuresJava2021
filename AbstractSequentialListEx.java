package HackvedaCollection;

import java.util.*;
import java.util.AbstractSequentialList;
  
public class AbstractSequentialListEx {
    public static void main(String args[])
    {
  
        // Creating an empty AbstractSequentialList
        AbstractSequentialList<String>
            absqlist = new LinkedList<String>();
  
        // Using add() method to
          // add elements in the list
        absqlist.add("1");
        absqlist.add("2");
        absqlist.add("3");
        absqlist.add("4");
        absqlist.add("5");
  
        // Output the list
        System.out.println("AbstractSequentialList: " + absqlist);
  
        absqlist.remove(3);
  
        // Print the final list
        System.out.println("List after removing element: " + absqlist);
  
        System.out.println("The element is: " + absqlist.get(2));
    }
}
