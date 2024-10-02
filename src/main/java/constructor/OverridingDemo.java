package constructor;

class Shape {
   void draw(){
        System.out.println("Drawing shape...");
    }
}

class Circle extends Shape{
    @Override
     void draw(){
        System.out.println("Drawing circle...");
    }
}

class Rectangle extends Shape{

    @Override
     void draw(){
        System.out.println("Drawing rectangle...");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {

    Shape s = new Shape();
    s.draw();

    Circle c  = new Circle();
    c.draw();

    Rectangle r = new Rectangle();
    r.draw();

    Shape s1 = new Circle();
    s1.draw();
    }
}






