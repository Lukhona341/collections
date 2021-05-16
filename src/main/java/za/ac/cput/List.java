package za.ac.cput;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;


public class List {
    ArrayList clients = new ArrayList();

    public void add() {
        clients.add(0, "Susan");
        clients.add(1, "Carlos");
        clients.add(2, "Liyabona");
        clients.add(3, "Bongisa");
        System.out.println("These are clients :" + "\n" + clients);

    }

    public void remove() {
        clients.add(0, "Susan");
        clients.add(1, "Carlos");
        clients.add(2, "Liyabona");
        clients.add(3, "Bongisa");

        clients.remove("Liyabona");
        System.out.println(" " + clients);

    }

    public String find(String element) {
        clients.add(0, "Susan");
        clients.add(1, "Carlos");
        boolean found = false;
        String search = "Carlos";
        for(Object x : clients) {
           if(x.equals(search))
           {
               found=true;
               break;
           }
        }
        System.out.println(found);
        return search;
    }

}



