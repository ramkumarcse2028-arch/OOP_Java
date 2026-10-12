class Base{
    public int x;

    public int getX(){
        return x;

    }
    public void setX(int x){
        System.out.println(" I am in base setting x now ");
        this.x = x;
    }
    public void printMe(){
        System.out.println(" I am a constructor ");
    }

}
class Derived extends Base{
    public int Y;

    public int getY(){
        return Y;
    }

    public void setY(int y){
        this.Y = y; 
    }
}
public class inheritance {
    public static void main(String[] args) {
        // creating  an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of derived class
        Derived d = new Derived();
        d.setY(44);
        System.out.println(d.getY());
    }
}
