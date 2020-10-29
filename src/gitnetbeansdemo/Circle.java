package gitnetbeansdemo;

public class Circle {
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getDiameter(){
        return 2*radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
