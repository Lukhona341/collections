package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetsTest {
    Set clientSet = new HashSet<List>();

    @Test
    public void add() {
        clientSet.add("Susan");
        clientSet.add("Carlos");
        clientSet.add("Liyabona");
        clientSet.add("Bongisa");

        System.out.println("These are clients :" + "\n" + clientSet);
assertNotNull(clientSet);
    }

    @Test
    public void remove() {
        clientSet.add("Susan");
        clientSet.add("Carlos");
        clientSet.add("Liyabona");
        clientSet.add("Bongisa");

        clientSet.remove("Liyabona");
        System.out.println(" " + clientSet);
assertNotNull(clientSet);
    }

    @Test
    public void find(int index) {
        System.out.println("Search the index in the list");
        try {
            clientSet.contains("Lukhona");
            System.out.println("Finding");
            System.out.println(clientSet.contains("Lukhona"));
        } catch (Exception e) {
            System.out.println("Client was not found");
        }
        System.out.println(clientSet.contains("Lukhona") + " was found ");
        assertNotNull(clientSet);
    }

}