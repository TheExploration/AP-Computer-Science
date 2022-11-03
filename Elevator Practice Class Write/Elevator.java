public class Elevator {
    
    private int passengerCount;
    private int currentFloor;
    private int maxFloor;
    private double speed;
    
    public Elevator() {
        passengerCount=0;
        currentFloor=1;
        maxFloor=1;
        speed=0;
    }
    
    public Elevator(int passengerCount, int currentFloor, int maxFloor, double speed) {
        this.passengerCount=passengerCount;
        this.currentFloor=currentFloor;
        this.maxFloor=maxFloor;
        this.speed=speed;
    }
    
    public int getPassengerCount() {
        return passengerCount;
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }
    
    public void setSpeed(double newSpeed) {
        if (newSpeed<-5 || newSpeed>5 ) 
            System.out.println("bad speed");
        else
            speed=newSpeed;
    }
    
    public void floorUp() {
        if (currentFloor<maxFloor)
            currentFloor++;
        else
            System.out.println("already at top floor");
    }
    
    public void floorDown() {
        if (currentFloor>1)
            currentFloor--;
        else
            System.out.println("already on bottom floor");
    }
    
    public boolean isStopped() {
        if (speed==0)
            return true;
        else
            return false;
    }
    
    public void addPassengers(int count) {
        if (count>0) 
            passengerCount+=count;
        else
            System.out.println("bad count");
    }
    
    public void removePassengers(int count) {
        if (count<passengerCount) 
            passengerCount-=count;
        else
            System.out.println("bad count");
    }
    
    public String toString() {
        return "Floor" + currentFloor + " , " + passengerCount + " passengers";
    }
    
}


