package za.ac.cput;
import java.util.HashMap;

public class Map

{
    private  String names,department,address;

    public Map(String names, String department, String address) {
        this.names = names;
        this.department = department;
        this.address = address;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

}
