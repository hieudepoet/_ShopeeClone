package model.user;

import java.util.HashMap;
import java.util.Map;

public class CustomerManagement {
    private static Map<String, Customer> customers = new HashMap();
    private boolean loggedIn;

    public static Map<String, Customer> getCustomers() {
        return customers;
    }
    public static void setCustomers(Map<String, Customer> customers) {
        CustomerManagement.customers = customers;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}
