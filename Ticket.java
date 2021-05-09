
class Ticket {
    private int seatNumber;
    private double fare;
    private static int totalTickets = 0;
    
    public Ticket(int seatNumber, double fare) {
        this.seatNumber = seatNumber;
        this.fare = fare;
        totalTickets++;
    }
    
    public int getSeatNumber() {
        return seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public double getFare() {
        return fare;
    }
    
    public void setFare(double fare) {
        this.fare = fare;
    }
    public static int getTotalTickets() {
        return totalTickets;
    }
}
    
    
    