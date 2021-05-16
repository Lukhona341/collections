package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ClientCollectionTest {

    Collection clientCollection = new HashSet();

    @Test
    void add()
    {
        clientCollection.add("Asiphiwe");
        clientCollection.add("Bongisa");
        clientCollection.add("Lukhona");
        System.out.println(" " + clientCollection);
        assertEquals(3,clientCollection.size());
    }

    @Test
  void remove()
  {
      clientCollection.add("Asiphiwe");
      clientCollection.add("Bongisa");
      clientCollection.add("Lukhona");
      clientCollection.remove("Asiphiwe");
      System.out.println(" " + clientCollection);
      assertEquals(2,clientCollection.size());
  }

  @Test
  void find()
  {
      clientCollection.add("Asiphiwe");
      clientCollection.add("Bongisa");
      clientCollection.add("Lukhona");

      System.out.println("Search");
      try {
          clientCollection.contains("Lukhona");
          System.out.println("Finding....");
          System.out.println(clientCollection);

      } catch (Exception e) {
          System.out.println("No results");
      }
      System.out.println(clientCollection + " was found ");
      assertNotNull(clientCollection);
  }


}