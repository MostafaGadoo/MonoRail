package MonoRailBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
     
         ArrayList<Train> arr ;
    public Admin() {
         arr=new ArrayList<Train>();
         arr.add(new Train(123,50));
         arr.add(new Train(551,40));
         arr.add(new Train(600,45));
         arr.add(new Train(225,50));
         arr.add(new Train(451,50));
    }
    
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        
    }
    
 
 
    public void addTrain(int trainNumber, int numberOfSeats){
        Train train1 = new Train(trainNumber, numberOfSeats);
        arr.add(train1);
        System.out.println("Train has been added successfully with id number" + trainNumber);
    }
    
    
    
    public Train removeTrain(int trainID){
        Train T = new Train();
        for(int i = 0;i < arr.size(); i++){
            T = arr.get(i);
            if(T.getTrainID() == trainID)
            return arr.remove(i);
        }
        return null;
    }
    
    
    public void updateTrain(int trainID){
        Scanner S1 = new Scanner(System.in);
        Train T = new Train();
        int seatNo;
        for(int i = 0; i < arr.size(); i++){
            T = arr.get(i);
            if(T.getTrainID() == trainID) {
                System.out.println("Please enter the new number of seats to update it");
                seatNo = S1.nextInt();
                T.setNumberOfSeats(seatNo);
                arr.add(i , T);
            }
        }
        S1.close();
    }
    public void Search(String username){
         Admin a=new Admin();
        for(int i=0;i<admins.size();i++){
            a=admins.get(i);
            if(a.getUsername()== username){
                System.out.println("Admin account is found");
            }
            else{
                System.out.println("Account not Found");
            }
        }
    }
    public void Report(Route R,Ticket T){
       if(R.getRouteID()==1){
        T.totalFare();
       }
       else if(R.getRouteID()==2){
        T.totalFare();
       }
        else if(R.getRouteID()==3){
       T.totalFare();
        }
        System.out.println("the total number of passengers"+T.getTotalFare());
        System.out.println("the totalfare is: "+T.totalFare());
        }
    public void changeAdminPassword(String password) {
        setPassword(password);
    }
    public void changeAdminUsername(String username) {
        setUsername(username);
    }
    public void changeAdminFirstName(String firstName) {
        setFirstName(firstName);
    }
    public void changeAdminLastName(String lastName) {
        setLastName(lastName);
    }
}