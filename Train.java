package trainPack;

public class Train {
    private int numberOfSeats;
    private int trainID;
    public Train(int id, int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        trainID = id;
    }
    public Train() {
        numberOfSeats = 0;
        trainID = 0;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    public void setTrainID(int id) {
        trainID = id;
    }

    public int getTrainID() {
        return trainID;
    }
}

