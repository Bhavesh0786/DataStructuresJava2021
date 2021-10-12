package HackvedaCollection;

import java.util.*;

public class AbstractListImplementation {
 public static void main(String args[])
 {

    
     AbstractList<String> list = new ArrayList<String>();

     list.add("Rahul");
     list.add("Nikhil");
     list.add("Aman");
     list.add("Mohit");
     list.add("Ajey");

     // Displaying the AbstractList
     System.out.println("AbstractList:" + list);
     list.remove(3); 
     
     // Print the final list 
     System.out.println("Final AbstractList: " + list); 

     int lastindex = list.lastIndexOf("Ajey"); 
     int lastindex2 = list.lastIndexOf("Bhavesh");

     // printing the Index 
     System.out.println("Last index of Ajey : " + lastindex); 
     System.out.println("Last index of Bhavesh : " + lastindex2); 
 }
}