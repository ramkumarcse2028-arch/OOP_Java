// Question ->  create a class spare and use constructer  to set its radius  , surfaceArea and volume
class spare{

    private int radius;

    public spare (int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    
    public double surfaceArea(){
        return 4*3.14*radius*radius;
    }
    public double volume(){
        return (4.0/3)*3.14*radius*radius*radius;
    }
}
public class constructer_spare {
    public static void main(String[] args) {
        spare mySpare = new spare(6);
        //myCylinder.setHeight(12);
        //System.out.println(myCylinder.getHeight());
        // myCylinder.setRadius(10);
        System.out.println(mySpare.getRadius());
        System.out.println(mySpare.surfaceArea());
        System.out.println(mySpare.volume());
    }
    
}
