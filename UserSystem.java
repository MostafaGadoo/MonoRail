
/*
** @Author Eyad Mostafa
**/


//Needs to import user class here

import java.util.ArrayList;
import java.util.Scanner;
public class UserSystem {
    private ArrayList<User> users = new ArrayList<User>(); 
    
    public UserSystem() {
        users.clear();
    }
    public void createAccount(String type, String username, String password, String fname, String lname) {
        if(type == "admin" || type == "Admin") {
            Admin adminUser = new Admin(username, password, fname, lname);
            adminUser.setType("Admin");
            users.add(adminUser);
            System.out.println("Admin user has been created successfully");
        }
        else if(type == "passenger" || type == "Passenger") {
            Passenger passengerUser = new Passenger(username, password, fname, lname);
            passengerUser.setType("Passenger");
            users.add(passengerUser);
            System.out.println("Passenger user has been created successfully");
        }
    }

    //Login returns user of instance matching username and password

    public User Login(String username, String password) {
        User index = new User();
        //creating user object
        for(int i = 0; i < users.size(); i++) {
            index = users.get(i);
            // Check username
            if (index.getUsername() == username) {
                if(index.getPassword() != password) {
                    System.out.println("Wrong password");
                }
                else if(index.getPassword() == password) {
                    System.out.println("Login successful");
                    return index;
                }                
            }
        }
        return index; 
    }

    public void adminOptions(Admin adminUser) {
        int option = 0;
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Change Admin Username");
        System.out.println("2- Change Admin Password");
        System.out.println("3- Change Admin Firstname");
        System.out.println("4- Change Admin Lastname");
        System.out.println("5- Add Train");
        System.out.println("6- Remove Train");
        System.out.println("7- Update Train");
        System.out.println("8- Generate Report");
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
        while(option != -1) {
            switch(option) {
                case 1:
                String username;
                System.out.println("Please enter new username");
                username = input.nextLine();
                adminUser.changeAdminUsername(username);
                break;
                case 2:
                String password;
                System.out.println("Please enter new password");
                password = input.nextLine();
                adminUser.changeAdminPassword(password);
                break;
                case 3:
                String fname;
                System.out.println("Please enter new first name");
                fname = input.nextLine();
                adminUser.changeAdminFirstName(fname);
                break;
                case 4:
                String lname;
                System.out.println("Please enter new last name");
                lname = input.nextLine();
                adminUser.changeAdminLastName(lname);
                break;
                /* case 5:
                *  case 6:
                *  case 7:
                *  case 8:
                */ //still to be implemented
                default:    
                System.out.println("Please check the list and re-enter a number");
                break;

            }
            
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Change Admin Username");
        System.out.println("2- Change Admin Password");
        System.out.println("3- Change Admin Firstname");
        System.out.println("4- Change Admin Lastname");
        System.out.println("5- Add Train");
        System.out.println("6- Remove Train");
        System.out.println("7- Update Train");
        System.out.println("8- Generate Report");
        option = input.nextInt();
        }
    input.close();
    }


    public void passengerOptions(Passenger passengerUser) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Book a ticket");
        System.out.println("2- Change seat for most recent ticket booked");
        System.out.println("3- Print ticket list");
        System.out.println("4- Change your username");
        System.out.println("5- Change your password");
        System.out.println("6- Change your first name");
        System.out.println("7- Change your last name");
        option = input.nextInt();
        while(option != -1) {
            switch(option) {
                case 1: 
                    String origin, end;
                    int seatno;
                    double fare;
                    System.out.println("Enter origin, end, seat number and fare for ticket respectively");
                    origin = input.nextLine();
                    end = input.nextLine();
                    seatno = input.nextInt();
                    fare = input.nextDouble();
                    passengerUser.bookTicket(origin, end, seatno, fare);
                    break;
                case 2:
                    int num;
                    System.out.println("Enter new seat number to update it for your most recently booked ticket");
                    num = input.nextInt();
                    passengerUser.changeSeat(num);
                    break;
                case 3:
                    passengerUser.printTicketList();
                    break;
                case 4:
                    System.out.println("Please enter your new username");
                    String username;
                    username = input.nextLine();
                    passengerUser.changePassengerUsername(username);
                    break;
                case 5:
                    System.out.println("Please enter your new password");
                    String password;
                    password = input.nextLine();
                    passengerUser.changePassengerPassword(password);
                    break;
                    
                case 6:
                System.out.println("Please enter your first name");
                String fname;
                fname = input.nextLine();
                passengerUser.changePassFirstName(fname);
                break;
                
                case 7:
                    System.out.println("Please enter your new password");
                    String lname;
                    lname = input.nextLine();
                    passengerUser.changePassLastName(lname);
                    break;
                default:
                    System.out.println("Invalid number entered please try again");
                    break;


                }
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Book a ticket");
        System.out.println("2- Change seat for most recent ticket booked");
        System.out.println("3- Print ticket list");
        System.out.println("4- Change your username");
        System.out.println("5- Change your password");
        System.out.println("6- Change your first name");
        System.out.println("7- Change your last name");
        option = input.nextInt();
            }
            input.close();
    }
    

}
