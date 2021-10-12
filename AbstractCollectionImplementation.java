package HackvedaCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
  
public class AbstractCollectionImplementation {
    public static void main(String[] args)
    {
        // Create an empty collection
        AbstractCollection<Object> abs = new ArrayList<Object>();
  
        // Use add() method to add
        // elements in the collection
        abs.add("ArrayList");
        abs.add("Stack");
        abs.add("Queue");
        abs.add("List");
        abs.add("Dequeue");
  
        // Displaying the Collection
        System.out.println("AbstractCollection: " + abs);
    }
}
