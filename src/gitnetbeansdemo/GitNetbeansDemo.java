package gitnetbeansdemo;


public class GitNetbeansDemo {

    
    public static void main(String[] args) {

        Square square = new Square(5);
        
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square);
        
        Circle circle = new Circle(4.0);
        
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        
        
    }
    
}
