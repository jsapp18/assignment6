import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Scanner grabber = new Scanner(System.in);
        System.out.println("Enter the sides of your triangle");
        double s1 = grabber.nextDouble();
        double s2 = grabber.nextDouble();
        double s3 = grabber.nextDouble();
        System.out.println("Eneter a color");
        String color = grabber.next();
        System.out.println("is the triangle filled? true or false");
        boolean isfilled = grabber.nextBoolean();
        Triangle test = new Triangle(s1, s2, s3);
        test.setColor(color);
        test.setFilled(isfilled);
        System.out.println(test.toString());
        System.out.println(test.getArea() + "-area");
        System.out.println(test.getPerimeter() + "-perimeter");
        System.out.println(test.getColor() + "-color");
        System.out.println(test.isFilled() + "is the triangle filled?");
        
    }
   

}
