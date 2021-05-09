
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author: Mostafa Gado
 */
class Train {
    private int numberOfSeats;
    private int trainID; 
    private static int trainCount = 0;
    public Train(int id, int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        trainID = id;
        trainCount++;
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
    public static int getTrainCount() {
        return trainCount;
    }
    

}

