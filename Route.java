package Route;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Route {
    //assuming speed of every train is constant equals 60 km/h
    private int routeID;
    private ArrayList <String> stoppingStations = new ArrayList<>();
    private ArrayList <Integer> runningTime = new ArrayList<>();
    private ArrayList <Integer> distance = new ArrayList<>();
    private final int trainSpeed = 60; // 60 km/h
    private String originStation;
    private String endStation;
    
    public Route(int routeID, String[] stations) {
        this.routeID = routeID;
        int time;
        for(int i = 0; i < stations.length; i++) {
            stoppingStations.add(stations[i]);
        }
        for(int i = 1; i < stations.length; i++) {
            int randDist = new Random().nextInt(15);
            distance.add(randDist);
        }
        for(int i = 1; i < stations.length; i++) {
            time = distance.get(i) / trainSpeed;
            runningTime.add(time);
        }
        originStation = stoppingStations.get(0);
        endStation = stoppingStations.get(stoppingStations.size() - 1);
    }
    public int getTimeBet2Stations(String origin, String end) {
        Scanner input = new Scanner(System.in);
        while(origin != stoppingStations.get(0)) {
            System.out.println("The station name you entered isn't the origin of this route please try again");
            origin = input.nextLine();
        }
        int endIndex;
        int time2Stations = 0;
        endIndex = stoppingStations.indexOf(end);
        for(int i = 0; i < endIndex - 1; i++) {
            time2Stations += runningTime.get(i);
        }
        return time2Stations;
    }
    public void setRouteID(int id) {
        routeID = id;
    }
    public void setStoppingStations(String[] stations) {
        for(int i = 0; i < stations.length; i++) {
            stoppingStations.add(stations[i]);
        }
    }
    public void setDistances(String[] stations) {

    for(int i = 1; i < stoppingStations.size() - 1; i++) {
            int randDist = new Random().nextInt(15);
            distance.add(randDist);
        }
    }
    public void setRunningTimes() {
        int time;
        for(int i = 1; i < stoppingStations.size() - 1; i++) {
            time = distance.get(i) / trainSpeed;
            runningTime.add(time);
        }
    }
    public void setOriginStation() {
        originStation = stoppingStations.get(0);
    }
    public void setEndStation() {
        endStation = stoppingStations.get(stoppingStations.size() - 1);
    }
    public int getRouteID() {
        return routeID;
    }
    public ArrayList<String> getStoppingStations() {
        return stoppingStations;
    }
    public ArrayList<Integer> getDistances() {
        return distance;
    }
    public ArrayList<Integer> getRunningTimes() {
        return runningTime;
    }
    public String getOriginStation() {
        return originStation;
    }
    public String getEndStation() {
        return endStation;
    }
}