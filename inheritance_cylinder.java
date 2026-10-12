/* Question ->  create a class rectangle and use inheritance to create another class cuboid area & volume  */

class Rectangle {
    public int length;
    public int breadth;

    Rectangle() {
        System.out.println("I am non-param constructor of rectangle");
    }

    Rectangle(int l) {
        System.out.println("I am rectangle length constructor");
        this.length = l;
    }

    Rectangle(int l, int b) {
        System.out.println("I am rectangle (l,b) constructor");
        this.length = l;
        this.breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    public int height;

    Cuboid(int l, int b, int h) {
        super(l, b);  // calls Rectangle(int,int)
        System.out.println("I am cuboid parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class inheritance_cylinder {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4, 8);  
        System.out.println("Area = " + obj.area());

        Cuboid obj1 = new Cuboid(4, 6, 8);
        System.out.println("Volume = " + obj1.volume());
    }
}
