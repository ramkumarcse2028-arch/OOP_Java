abstract class parent{
    public parent(){
        System.out.println("mai base ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
    System.out.println("Good afternoon");
    }
}
abstract class child1 extends parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class abstract_example {
    public static void main(String[] args) {
       //  parent p = new parent(): -- error
        child c = new child();
        // child c1 = new child1(); --- error
    }
    
}
