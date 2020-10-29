
package gitnetbeansdemo;


public class Square {
    
    private double side;
    
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area(double side){
        return side*side;
    }
    
    public double  perimeter(){
        return side*4;
    }
    
    public double getArea(){
        return  side*side;
    }
    public double getPerimeter(){
        return  side*4;
    }

    @Override
    public String toString() {
        return "Side = " + side + "\n" 
                + "Area = " + getArea() + "\n" 
                + "Perimeter = " + getPerimeter();
    }

    
    
    
}
