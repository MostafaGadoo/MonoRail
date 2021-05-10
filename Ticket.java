class Ticket{
    
    private int seatNumber;
    private double departureTime;
    private String passengerDeparture;
    private String passengerArrival;
    private double arrivalTime;
    private Trip tripObj;
    private double fare;

    public Ticket(int seatNumber, double departureTime, Trip tripInput, String origin, String end) {
            tripObj = tripInput;
            passengerDeparture = origin;
            passengerArrival = end;
            Route r2 = tripObj.getRoute();
            this.seatNumber = seatNumber;
            this.departureTime = departureTime;
            this.arrivalTime = departureTime + r2.getTimeBet2Stations(passengerDeparture, passengerArrival);
            if(r2.getRouteID() == 1) {
                fare = 10;
            }
            else if(r2.getRouteID() == 2) {
                fare = 15;
            }
            else if(r2.getRouteID() == 3) {
                fare = 20;
            }
            else {
                System.out.println("Invalid route id entered");
            }
    }
    public void setSeatNumber(int seatNum) {
        seatNumber = seatNum;
    }
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }
    public void setArrivalTime() {
        Route routeObj = tripObj.getRoute();
        arrivalTime = departureTime + routeObj.getTimeBet2Stations(passengerDeparture, passengerArrival);
    }
    public void setTrip(Trip tripObj) {
        this.tripObj = tripObj;
    }
    public void setFare(int id) {
        if(id == 1) {
            fare = 10;
        }
        else if(id == 2) {
            fare = 15;
        }
        else if(id == 3) {
            fare = 20;
        }
        else {
            System.out.println("Invalid route id entered");
        }
    }
    public void setpassengerDeparture(String origin) {
        passengerDeparture = origin;
    }
    
    public void setPassengerArrival(String end) {
        passengerArrival = end;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public double getDepartureTime() {
        return departureTime;
    }
    
    public String getPassengerDeparture() {
        return passengerDeparture;
    }
    public String getPassengerArrival() {
        return passengerArrival;
    }
    public double getArrivalTime() {
        return arrivalTime;
    }
    public Trip getTrip() {
        return tripObj;
    }
    public double getFare() {
        return fare;
    }
    public void displayTicketInfo() {
        System.out.println("Ticket info...");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Departure station: " + passengerDeparture);
        System.out.println("Arrival station" + passengerArrival);
        System.out.println("Departure time: " + departureTime);
        System.out.println("Arrival time: " + arrivalTime);
        System.out.println("Ticket fare: " + fare);
    }
}