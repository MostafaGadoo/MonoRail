
/*
*
*   @Author Eyad Mostafa
*
*/
import java.util.ArrayList;
public class Passenger extends User {
    
    ArrayList<Ticket> ticketsArr = new ArrayList<>();

    public Passenger(String username, String password, String fname, String lname) {
        super(username, password, fname, lname);
    }

    
    /** 
     * @param password
     */
    // Functions for passenger to edit/manage their account

    public void changePassengerPassword(String password) {
        setPassword(password);
    }
    
    /** 
     * @param username
     */
    public void changePassengerUsername(String username) {
        setUsername(username);
    }
    
    /** 
     * @param firstName
     */
    public void changePassFirstName(String firstName) {
        setFirstName(firstName);
    }
    
    /** 
     * @param lastName
     */
    public void changePassLastName(String lastName) {
        setLastName(lastName);
    }

    
    /** 
     * @param seatNumber
     * @param tripInput
     * @param endStation
     * Function books ticket adds it to ticketsArr in passenger
     */
    public void bookTicket(int seatNumber, Trip tripInput, String endStation) {
        Ticket ticket1 = new Ticket(seatNumber, tripInput, endStation);
        ticketsArr.add(ticket1);
        System.out.println("Ticket has been booked successfully");
    }
    
    /** 
     * @param seatNumber
     * Function changes seat number for last booked ticket, updates last element in tickets arraylist
     */
    public void updateBookingSeat(int seatNumber) {
        Ticket ticketObj = ticketsArr.get(ticketsArr.size() - 1);
        ticketObj.setSeatNumber(seatNumber);
        ticketsArr.add(ticketsArr.size() - 1, ticketObj);
    }

    
    /** 
     * @param trip
     * Function updates Trip for last booked ticket, updates last element in  tickets arraylist
     */
    public void updateBookingTrip(Trip trip) {
        Ticket ticketObj = ticketsArr.get(ticketsArr.size() - 1);
        ticketObj.setTrip(trip);
        ticketsArr.add(ticketsArr.size() - 1, ticketObj);
    }
    /**
     * Function cancels ticket, removes last booked ticket from tickets arraylist
     */
    public void cancelBooking() {
        ticketsArr.remove(ticketsArr.size() - 1);
        System.out.println("Most recently booked ticket has been cancelled");
    }
    /**
     * Function to print All tickets in passenger accout, prints ticket info for all elements in ticket arraylist
     */

    public void printTicketList() {
        Ticket ticketObj = new Ticket();
        for(int i = 0; i < ticketsArr.size(); i++) {
            ticketObj = ticketsArr.get(i);
            System.out.print(i + ". ");
            ticketObj.displayTicketInfo();
            System.out.println("");
        }
    }

}
