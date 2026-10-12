/* Question -> create a class circle and use inheritance to create another class cylinder from it area & volume ! */
class circle{
    public int radius;
    circle(){
        System.out.println("I am non param of circle ");
    }
    circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return 3.14*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int hight;
    cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.hight = h;
    }
    public double volume(){
        return 3.14 *this.radius*this.radius*this.hight;
    
    }
}
public class inheritance1 {
        public static void main(String[] args) {
        circle obj = new circle(8);
        System.out.println("Area = " + obj.area());   

        cylinder obj1 = new cylinder(5, 8);
        System.out.println("Volume = " + obj1.volume()); 
    }

    
}

