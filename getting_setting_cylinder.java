// Question ->  create a class  cylinder to calculate surface area and volum of the cylinder 
class cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14 *radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    
}
public class getting_setting_cylinder {
    public static void main(String[] args) {
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
    
}
