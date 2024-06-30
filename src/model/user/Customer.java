package model.user;

import java.util.Scanner;

import model.User;

public class Customer extends User{
    private String phone_number;

    public Customer(int userID, String username, String email, String password, String phone_number) {
        super(userID, username, email, password);
        this.phone_number = phone_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void login() {
        
                
        String username , password;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username : ");username = sc.nextLine();
        System.out.print("Enter password : ");password = sc.nextLine();

        for (User user : CustomerManagement.getCustomers().values()){

            if (user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    System.out.println();
                    
                }
            }

        }
        

        sc.close();
    }

    public void logout() {

        
    }

    public void register() {
        if (!CustomerManagement.getCustomers().containsKey(getUsername())) {
            CustomerManagement.getCustomers().put(getUsername(), this);
            System.out.println("Registration successful for user: " + getUsername());
        } else {
            System.out.println("Username already exists: " + getUsername());
        }
    }
}
