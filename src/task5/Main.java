package task5;

public class Main { public static void main(String[] args) {
    System.out.println("============================");
    Rectangle rec=new Rectangle(3, 4);

    System.out.println("Area of rectangle is "+rec.calculateArea());
    System.out.println("============================");

    Circle cir=new Circle(3);

    System.out.println("Area of circle is "+cir.calculateArea());
    System.out.println("============================");

    Triangle triangle = new Triangle(4, 5);
    System.out.println("Area of triangle is "+triangle.calculateArea());
}


}