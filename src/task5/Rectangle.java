package task5;

class Rectangle extends Figure
{
    double length;
    double breadth;


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}