/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonoRailBookingSystem;

import java.util.ArrayList;


public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String accountType;
     ArrayList<Admin> admins ;
    
    public User(String username, String password, String fname, String lname) {
        this.username = username;
        this.password = password;
        firstName = fname;
        lastName = lname;
        accountType = "";
    }
    public User() {
        username = "";
        password = "";
        firstName = "";
        lastName = "";
        accountType = "";
        admins=new ArrayList<Admin> ();
         admins.add(new Admin("ahmed","1234","Ahmed","Adel"));
         admins.add(new Admin("Mostafa","12345","Mostafa","Gado"));
         admins.add(new Admin("Sana","3333","Sana","Darweesh"));
         admins.add(new Admin("Menna","4444","Ahmed","Magdy"));
         admins.add(new Admin("Eyad","123457","Eyad","Mostafa"));
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstName(String fname) {
        firstName = fname;
    }
    public void setLastName(String lname) {
        lastName = lname;
    }
    public void setType(String type) {
        this.accountType = type;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getType() {
        return accountType;
    }
}