public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    // makes a base triangle
    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    // makes a triangle with specified sides
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //get side1
    public double getSide1(){
        return side1;
    }
    //gets side 2
    public double getSide2(){
        return side2;
    }
    // gets side 3
    public double getside3(){
        return side3;
    }
    // gets the area
    public double getArea(){
        double math_thing = (side1 + side2 + side3) / 2;
        return Math.sqrt(math_thing * (math_thing - side1) * (math_thing - side2) * (math_thing - side3));
    }
    // gets the perimeter
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    // returns a string with info about the triangle
    public String toString(){
        return "This triangle has 3 sides, with lengths in order of side - " + side1 + "  " + side2 + "  " + side3;
    }
}   
