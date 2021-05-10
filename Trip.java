package tripPackage;
import routePackage.Route;
import trainPack.Train;
/**
 * Authors: Eyad Mostafa // Mostafa Gado
 */
import java.util.ArrayList;
public class Trip {

    int tripID;
    Route routeObj;
    enum states{empty,reserved};
    private static ArrayList<states> seats = new ArrayList<>();
    Train trainObj;
    String tripOriginStation,tripEndStation;
    double tripStartTime,tripEndTime;
    
    
    public Trip(int id, Route routeInput, int depTime, Train trainInput) {
        this.tripID = id;
        routeObj = routeInput;
        trainObj = trainInput;
        for(int i = 0; i < trainObj.getNumberOfSeats(); i++) {
            seats.add(states.empty);
        }
        tripOriginStation = routeObj.getOriginStation();
        tripEndStation = routeObj.getEndStation();
        tripStartTime = depTime;
        tripEndTime = tripStartTime + routeObj.getTimeBet2Stations(routeObj.getOriginStation(), routeObj.getEndStation());

        
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
    public void emptySeat(int seatNumber) {
        seats.add(seatNumber - 1, states.empty);
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
    
    public String getTripArrivalStation() {
        return tripEndStation;
        
    }
    public double getTripBegin() {
        return tripStartTime;
    }
    public double getTripEnd() {
        return tripEndTime;
    }
}