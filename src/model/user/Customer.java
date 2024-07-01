package model.user;

import model.User;

public class Customer extends User{
    private boolean isLogged;

    public Customer(int userID, String username, String email, String password, boolean isLogged) {
        super(userID, username, email, password);
        this.isLogged = isLogged;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
}
