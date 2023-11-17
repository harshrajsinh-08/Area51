abstract class Shape {
    abstract void rectarea(double length, double breadth);
    abstract void sqarea(double side);
    abstract void cirarea(double radius);
}

class Area extends Shape {
    @Override
    void rectarea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void sqarea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void cirarea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class shape {
    public static void main(String[] args) {
        Area calcarea = new Area();
        calcarea.rectarea(5.0, 7.0);
        calcarea.sqarea(4.5);
        calcarea.cirarea(3.0);
    }
}
