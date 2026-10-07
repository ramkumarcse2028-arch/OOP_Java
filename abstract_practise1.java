/* Question --> create an abstract class pen with methods write() and refull as abstract method 
concrete class fountain pen with additional method changeNib()*/
abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {

    void write() {
        System.out.println("Writing with fountain pen");
    }

    void refill() {
        System.out.println("Refilling ink");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

public class abstract_practise1 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}