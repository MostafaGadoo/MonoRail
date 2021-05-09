
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package project;

import java.util.ArrayList;
import java.util.Scanner;
public class Admin extends User {
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        
    }
    
    private static ArrayList<Train> arr;
    
    public void AddTrain(int trainNumber, int numberOfSeats){
        Train T1 = new Train(trainNumber, numberOfSeats);
        arr.add(T1);
    }
    
    
    
    public Train RemoveTrain(int trainID){
        Train T = new Train();
        for(int i = 0;i < arr.size(); i++){
            T = arr.get(i);
            if(T.getTrainID() == trainID)
            
            
            return arr.remove(i);
        }
        return null;
    }
    
    
    public void UpdateTrain(int trainID){
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