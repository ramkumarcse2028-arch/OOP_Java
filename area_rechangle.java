/* Question -> create a class reactangle with methd to initialize its lenth breath calculate area and perimeter */

class reactangle{
    int length = 14;
    int width = 12;
    public int area_rechangle(){
        return length * width;

    }
    public int perimeter(){
        return 2 * (length + width);
    }
}
public class area_rechangle {
    public static void main(String[] args) {
        reactangle r = new reactangle();
        System.out.println(r.area_rechangle());
        System.out.println(r.perimeter());

        
    }

}
