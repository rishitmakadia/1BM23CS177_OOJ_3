abstract class Shape{
    double a,b;
    Shape(double x, double y){
        a=x;
        b=y;
    }
    abstract double printArea();
}
class Rectangle extends Shape{
    Rectangle (double i, double j){
        super(i,j);
    }
    double printArea(){
        return a*b;
    }
}
class Triangle extends Shape{
    Triangle (double i, double j){
        super(i,j);
    }
    double printArea(){
        return 0.5*a*b;
    }
}
class Circle extends Shape{
    Circle (double r){
        super(r, 0);
    }
    double printArea(){
        return 3.14*a*a;
    }
}
class Lab_4{
    public static void main(String args[]){

        Rectangle ob1 = new Rectangle(5.0,5.0);

        Triangle ob2 = new Triangle(10.0,10.0);

        Circle ob3 = new Circle(3.0);

        System.out.println("Area of Rectangle is "+ob1.printArea());
        System.out.println("Area of Triangle is "+ob2.printArea());
        System.out.println("Area of Circle is "+ob3.printArea());
    }
}