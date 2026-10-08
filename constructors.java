/*class MyMainEmpolyee{
    private int id;
    private String name;

    public MyMainEmpolyee(){
        id = 50;
        name = "Ramkumar";

    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setid(int i){
        this.id= i;
    }
    public int getid(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmpolyee ram = new MyMainEmpolyee();
        System.out.println(ram.getid());
        System.out.println(ram.getName());
    }
    
} */

// overloading constructer //
class MyMainEmpolyee{
    private int id;
    private String name;

    /*public MyMainEmpolyee(){
        id = 50;
        name = "Ramkumar";

    } */
    
    public MyMainEmpolyee(){
        id = 0;
        name = " RamKumar ";

    }
    public MyMainEmpolyee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmpolyee(String myName){
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setid(int i){
        this.id= i;
    }
    public int getid(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmpolyee ram = new MyMainEmpolyee();
        System.out.println(ram.getid());
        System.out.println(ram.getName());
    }
    
}
