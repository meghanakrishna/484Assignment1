package HW1;

public class Customer {
    private int customerID;
    public String name;
    public String phone;
    public String address;
    public static int nextCustomerID = 0;
    
    public Customer(String name, String phone, String address)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.customerID = nextCustomerID++;
    }
    
    
}
