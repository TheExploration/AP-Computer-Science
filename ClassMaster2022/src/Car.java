    public class Car {
    
    public String name;
    public double weight;
    public int horsePower;
    
    public Car(String name, double weight, int horsePower){
        this.name=name;
        this.weight=weight;
        this.horsePower=horsePower;
    }
    
    public void getHeavy() {
       weight=weight+10000;   
    }
    
}
