// Question -> overload a constructer used to initialize a rectangle of length 4 and bregth 5 for using custom parameter
class rectangle{
    private int length;
    private int bregth;

    public rectangle(){
    this.length = 4;
    this.bregth = 5;

    }
    public rectangle(int length, int bregth){
    this.length = length;
    this.bregth = bregth;

    }
    public int getLength(){
        return length;
    }
    public int getBregth(){
        return bregth;
    }

    
}

public class constructer_overload_rectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getLength());
    }   
    
}
