/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonoRailBookingSystem;

/**
 *
 * @author Mostafa Gado
 */
public class User{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String accountType;
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
