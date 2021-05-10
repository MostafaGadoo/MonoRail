package project;

import java.util.ArrayList;
public class Trip {
    int tripID;
    Route routeObj;
    enum states{empty,reserved};
    private static ArrayList<states> seats = new ArrayList<>();
    Train trainObj;
    String tripOriginStation,tripEndStation;
    double tripStartTime,tripEndTime;
    
    
    public Trip(int id,String origin, String end, Route routeInput,  String tripEnd, double depTime,
     double arrivalTime,Train trainInput) {
        this.tripID = id;
        routeObj = routeInput;
        for(int i = 0; i < trainObj.getNumberOfSeats(); i++) {
            seats.add(states.empty);
        }
        trainObj = trainInput;
        tripOriginStation = origin;
        tripEndStation = end;
        tripStartTime = depTime;
        tripEndTime = arrivalTime;

        
    }
    public void SetTripID(int id) {
        tripID = id;
    }
    public void setRoute(Route routeInput) {
        routeObj = routeInput;
    }
    public void setSeatStates() {
        for(int i = 0; i < trainObj.getNumberOfSeats(); i++) {
            seats.add(states.empty);
        }
    }
    public void reserveSeat(int seatNumber) {
        seats.add(seatNumber - 1, states.reserved);
    }
    public void setTrain(Train trainInput) {
        trainObj = trainInput;
    }
    public void setTripOrigin(String origin) {
        tripOriginStation = origin;
    }
    
    public void setTripEnd(String end) {
        tripEndStation = end;
        
    }
    public void setTripBegin(double startTime) {
        tripStartTime = startTime;
    }
    public void setTripEndTime(double end) {
        tripEndTime = end;
    }
    public int getTripID() {
        return tripID;
    }
    public Route getRoute() {
        return routeObj;
    }
    public void getEmptySeats() {
        System.out.println("The empty seats are");
        for(int i = 0; i < trainObj.getNumberOfSeats(); i++) {
            if(seats.get(i) == states.empty) {
                System.out.println(i + 1 + ",");
            }
        }
    }
    public Train getTrain() {
        return trainObj;
    }
    public String getTripOrigin() {
        return tripOriginStation;
    }
    
    public String getTripEnd() {
        return tripEndStation;
        
    }
    public double getTripBegin(String startTime) {
        return tripStartTime;
    }
    public double getTripEnd(String end) {
        return tripEndTime;
    }
}