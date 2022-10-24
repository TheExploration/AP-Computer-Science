public class Thing {
    //variables
    private int age=0;
    //constructors
    public Thing() {
        age=0;        
    }
    
    public Thing(int age){
        this.age=age;
    }
    //accessor / mutator methods
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        if (age>=0 && age<100)
            this.age=age;
    }
    
    //other methods
    public boolean isSenior() {
        if (age>=65)
            return true;
        else
            return false;
    }
    
    
    
    
    public String toString() {
        return "i am thing" + age;
    }
}
