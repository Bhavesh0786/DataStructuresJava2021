package HackvedaCollection;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
  
public class AbstractQueueExample {
  
    public static void main(String[] argv) throws Exception
    {
        
        AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();
  
        // Adding elements to the Queue
        AQ.add(10);
        AQ.add(20);
        AQ.add(30);
        AQ.add(40);
        AQ.add(50);
        AQ.remove(10);
 
        System.out.println("AbstractQueue contains: " + AQ);
        
        AbstractQueue<Integer> AQ2 = new LinkedBlockingQueue<Integer>();
        
        // print AQ2 initially
        System.out.println("AbstractQueue2 initially contains : " + AQ2);
  
        // adds elements of AQ1 in AQ2
        AQ2.addAll(AQ);
  
        System.out.println( "AbstractQueue1 after addition contains : " + AQ2);
    }
}
