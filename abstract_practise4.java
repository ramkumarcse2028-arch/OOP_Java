/* Question -->  create a class telephone with ring(), lift(), and disconnect(), method as abstract methods
create another class smart telephone and demonstrate polynorphism */
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smart telephone extends telephone{
    void ring(){
        System.out.println("hello");
    }
    void left(){
        System.out.println("good");
    }
    void disconnect(){
        System.out.println("good morning");
    }

}
interface Smart telephone {
    void ring();
    void left();
    void disconnect();

    
}
public class abstract_practise4 {
    public static void main(String[] args) {
        Smart telephone ;
    }
}
