
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

    //Functions for passenger to edit/manage their account

    public void changePassengerPassword(String password) {
        setPassword(password);
    }
    public void changePassengerUsername(String username) {
        setUsername(username);
    }
    public void changePassFirstName(String firstName) {
        setFirstName(firstName);
    }
    public void changePassLastName(String lastName) {
        setLastName(lastName);
    }


    public void bookTicket(String origin, String end, int seatno, double fare) {
        Ticket ticket1 = new Ticket(origin, end, seatno, fare);
        ticketsArr.add(ticket1);
        System.out.println("Ticket has been booked successfully");
    }


    public void changeSeat(int seatno)
    {
        Ticket ticketObj = new Ticket();
        ticketObj = ticketsArr.get(ticketsArr.size() - 1);
        ticketObj.setSeatNumber(seatno);
        ticketsArr.set(ticketsArr.size() - 1, ticketObj);
        System.out.println("Seat updated successfully");
    }
    /*
    *   Functions for passenger to update booking, select seat and cancel booking will be implemented here
    *
    */
    public void printTicketList() {
        Ticket ticketObj = new Ticket();
        for(int i = 0; i < ticketsArr.size(); i++) {
            ticketObj = ticketsArr.get(i);
            ticketObj.displayTicketInfo();
        }
    }

}
