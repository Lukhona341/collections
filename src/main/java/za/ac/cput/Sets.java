package za.ac.cput;

import java.util.*;
import java.util.HashSet;

public class Sets
{
    private String name;

    public Sets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "List{" +
                "Skunk Clients ='" + name + '\'' +
                '}';
    }
    }


