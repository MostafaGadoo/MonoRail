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
import java.util.ArrayList;
import java.util.Scanner;
public class UserSystem {
    public ArrayList<User> users = new ArrayList<>(); 
    public Train train1;
    public Train train2;
    public Train train3;
    public Train train4;
    public Admin aUser;
    public Route route1;
    public Route route2;
    public Route route3;
    public Trip trip1;
    public Trip trip2;
    public Trip trip3;
    public Trip trip4;
    

    public UserSystem() {
        users.clear();
        train1 = new Train(12, 15);
        train2 = new Train(15, 15);
        train3 = new Train(23, 15);
        train4 = new Train(21, 15);
        aUser = new Admin("admin", "password", "Eyad", "Mostafa");
        users.add(aUser);

        
        String[] stations1 = {"Madinet Nasr", "Abbas El Aqaad", "Omar Makram", "Moqattam", "Fifth Settlement"};
        String[] stations2  = {"New Adminstrative Capital", "Youssef Abbas", "Ramsees Station", "Downtown Cairo"};
        String[] stations3 =  {"Maadi", "Abbas El Aqaad", "Omar Makram", "Cairo Airport", "Sheraton"};
        route1 = new Route(1, stations1);
        route2 = new Route(2, stations2);
        route3 = new Route(3, stations3);
        trip1 = new Trip(26, route1, 9, train1);
        trip2 = new Trip(28, route2, 9, train2);
        trip3 = new Trip(30, route3, 10, train3);
        trip4 = new Trip(19, route2, 12, train4);
    }
    
    /** 
     * @param username
     * @param password
     * @param fname
     * @param lname
     * This function creates a new passenger account
     */
    public void createAccount(String username, String password, String fname, String lname) {
            Passenger passengerUser = new Passenger(username, password, fname, lname);
            passengerUser.setType("Passenger");
            users.add(passengerUser);
            System.out.println("Passenger user has been created successfully");
        
    }

    
//     /** 
//      * @param username
//      * @param password
//      * @return User
//      * This function checks username matches password in the users array and returns the user accordingly
//      * So we are able to determine what type of account it is
//      */

    public User Login(String username, String password) {
        User index = new User();
        //Creating user object
        for(int i = 0; i < users.size(); i++) {
            index = users.get(i);
            // Check username
            if (index.getUsername() == username) {
                //Check password
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

    
    /** 
     * @param adminUser
     * This function displays the options for admin accounts after logging in
     */
    public void adminOptions(Admin adminUser) {
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
        int trainNumber;
        int option = 0;
        while(option != -1) {
            switch(option) {
                case 1:
                    String username;
                    System.out.println("Please enter new username");
                    username = input.next();
                    adminUser.changeAdminUsername(username);
                    break;
                case 2:
                    String password;
                    System.out.println("Please enter new password");
                    password = input.next();
                    adminUser.changeAdminPassword(password);
                    break;
                case 3:
                    String fname;
                    System.out.println("Please enter new first name");
                    fname = input.next();
                    adminUser.changeAdminFirstName(fname);
                    break;
                case 4:
                    String lname;
                    System.out.println("Please enter new last name");
                    lname = input.next();
                    adminUser.changeAdminLastName(lname);
                break;
                case 5:
                    System.out.println("Please enter train number and number of seats ");
                    trainNumber = input.nextInt();
                    int numberOfSeats = input.nextInt();
                    adminUser.addTrain(trainNumber, numberOfSeats);
                    break;
                case 6:
                    System.out.println("Please enter the train number to be removed");
                    trainNumber = input.nextInt();
                    adminUser.removeTrain(trainNumber);
                    break;
                case 7:
                    System.out.println("Please enter train number to update number of seats in train");
                    trainNumber = input.nextInt();
                    adminUser.updateTrain(trainNumber);
                //case 8: generate report
                default:    
                System.out.println("Please check the list and re-enter a number");
                option = input.nextInt();
                break;

            }
        }
        input.close();
    }
}
            
//         System.out.println("Please select one of the following options or enter -1 to exit");
//         System.out.println("1- Change Admin Username");
//         System.out.println("2- Change Admin Password");
//         System.out.println("3- Change Admin Firstname");
//         System.out.println("4- Change Admin Lastname");
//         System.out.println("5- Add Train");
//         System.out.println("6- Remove Train");
//         System.out.println("7- Update Train");
//         System.out.println("8- Generate Report");
//         option = input.nextInt();
//         }
//     input.close();
//     }


    
//     /** 
//      * @param passengerUser
//      * This function displays and calls passenger options so that the user can make actions
//      */
//     public void passengerOptions(Passenger passengerUser) {
//         int option = 0;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Please select one of the following options or enter -1 to exit");
//         System.out.println("1- Book a ticket");
//         System.out.println("2- Change seat for most recent ticket booked");
//         System.out.println("3- Print ticket list");
//         System.out.println("4- Change your username");
//         System.out.println("5- Change your password");
//         System.out.println("6- Change your first name");
//         System.out.println("7- Change your last name");
//         option = input.nextInt();
//         /*while(option != -1) {
//             switch(option) {
//                 case 1: 
//                     System.out.println("Enter origin, end, seat number and fare for ticket respectively");
//                     origin = input.nextLine();
//                     end = input.nextLine();
//                     seatno = input.nextInt();
//                     fare = input.nextDouble();
//                     passengerUser.bookTicket(origin, end, seatno, fare);
//                     break;
//                 case 2:
//                     int num;
//                     System.out.println("Enter new seat number to update it for your most recently booked ticket");
//                     num = input.nextInt();
//                     passengerUser.changeSeat(num);
//                     break;
//                 case 3:
//                     passengerUser.printTicketList();
//                     break;
//                 case 4:
//                     System.out.println("Please enter your new username");
//                     String username;
//                     username = input.nextLine();
//                     passengerUser.changePassengerUsername(username);
//                     break;
//                 case 5:
//                     System.out.println("Please enter your new password");
//                     String password;
//                     password = input.nextLine();
//                     passengerUser.changePassengerPassword(password);
//                     break;
                    
//                 case 6:
//                 System.out.println("Please enter your first name");
//                 String fname;
//                 fname = input.nextLine();
//                 passengerUser.changePassFirstName(fname);
//                 break;
                
//                 case 7:
//                     System.out.println("Please enter your new password");
//                     String lname;
//                     lname = input.nextLine();
//                     passengerUser.changePassLastName(lname);
//                     break;
//                 default:
//                     System.out.println("Invalid number entered please try again");
//                     break;


//                 }
//         System.out.println("Please select one of the following options or enter -1 to exit");
//         System.out.println("1- Book a ticket");
//         System.out.println("2- Change seat for most recent ticket booked");
//         System.out.println("3- Print ticket list");
//         System.out.println("4- Change your username");
//         System.out.println("5- Change your password");
//         System.out.println("6- Change your first name");
//         System.out.println("7- Change your last name");
//         option = input.nextInt();
//             }
//             input.close();
//             */
//     }

