package model.user;

import model.User;

public class Admin extends User{

    public Admin(int userID, String username, String email, String password) {
        super(userID, username, email, password);
    }
}
