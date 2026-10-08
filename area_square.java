/* Question -> create a class square with method to initialize its side calculating area perimeter */
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
public class area_square {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
    
}
