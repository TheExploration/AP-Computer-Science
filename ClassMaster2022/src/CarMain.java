public class CarMain {

    public static void main(String[] args) {
       Car myCar=new Car("honda", 3502.3, 150);
    
       System.out.println(myCar.name);
       System.out.println(myCar.weight);
       myCar.weight=4200.0;
       System.out.println(myCar.weight);
       myCar.weight=-123;
       System.out.println(myCar.weight);
    }
    
}
