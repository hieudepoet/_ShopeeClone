package model.user;

import java.util.HashMap;
import java.util.Map;

public class CustomerManagement {
    private static Map<Integer, Customer> customers;
    private int nextCustomerID;

    public CustomerManagement() {
        customers = new HashMap<>();
        nextCustomerID = 1;
    }

    public int register(String user_name, String email, String password) {
        int customerID = nextCustomerID++;
        Customer customer = new Customer(customerID, user_name, email, password, false);
        customers.put(customerID, customer);
        return customerID;
    }

    public Customer login(String user_name, String password) {
        for (Customer customer : customers.values()) {
            if (customer.getUsername().equals(user_name) && customer.getPassword().equals(password)) {
                customer.setLogged(true);
                System.out.println("Login successful.");
                return customer;
            } 
        }

        System.out.println("Invalid username or password.");
        return null;
    }

    public void logout(Customer customer) {
        if (customer != null && customer.isLogged()) {
            customer.setLogged(false);
            System.out.println("Logout successful.");
        }
        else {
            System.out.println("Error.");
        }
    }

    public Customer getCustomer(int customerID) {
        return customers.get(customerID);
    }

    public static Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(Map<Integer, Customer> customers) {
        CustomerManagement.customers = customers;
    }

    public void removeCustomer(int customerID) {
        customers.remove(customerID);
    }
}
