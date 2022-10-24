public class Parallelogram {
    
    private double width;
    private double length;
    private double angle;
    
    public Parallelogram(double width, double length, double angle) {
        this.width=width;
        this.length=length;
        this.angle=angle; //in degrees
    }
    
    public double getWidth() {
        return(width);
    }
    
    public double getLength() {
        return(length);
    }
    
    public double getAngle() {
        return(angle);
    }
    
    public void setSides(double w, double l){
        if (w>0 && l>0) {
            width=w;
            length=l;
        }
        else
            System.out.println("not valid w and l");
    }
    
    public void setAngle(double a) {
        if (a>0 && a<180)
            angle=a;
        else
            System.out.println("not valid angle");
    }
    
    public double getPerimeter() {
        double perimeter = 2*width + 2*length;
        return(perimeter);
    }
    
    public double getArea() {
        double area=width*length*(Math.sin(Math.toRadians(angle)));
        return(area);
    }
    
    public void doubleSize() {
        width*=2;
        length*=2;
    }
    
    public void halveSize() {
        width/=2;
        length/=2;
    }
    
    public boolean isRectangle() {
        if (angle==90)
            return true;
        else
            return false;
    }    
    
    public boolean isSquare() {
        if (width==length && isRectangle() )
            return true;
        else
            return false;
    }
    

    

     
}
