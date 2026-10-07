/* Question ->   create a class monkey with jump() and bite() method create a class human 
which inherirets this monkey class and implements basicAnimal interface with cat() and sleep method */
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("Biting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class abstract_practise2 {
    public static void main(String[] args) {
        Human ram = new Human();
        ram.sleep();
    }
    
}
