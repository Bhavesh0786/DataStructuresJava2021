package HackvedaCollection;

import java.util.Collection;
import java.util.LinkedList;
 
public class CollectionDemo {
    public static void main(String args[])
    {
 
        Collection<String> list = new LinkedList<String>();
 
        // use add() method to add elements in the list
        list.add("Hackveda");
        list.add("Java");
        list.add("Data Structures");
 
        // Output the present list
        System.out.println("The list is: " + list);
 
        // Adding new elements to the end
        list.add("Collection ");
        list.add("Interface");
 
        // printing the new list
        System.out.println("The new List is: " + list);
    }
}