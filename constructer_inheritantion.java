

class Base {
    Base() {
        System.out.println("I am Base constructor");
    }

    Base(int a) {
        System.out.println("I am Base overloaded constructor with value of a: " + a);
    }
}

class Derived extends Base {
    Derived() {
        super(0);
        System.out.println("I am a Derived class constructor");
    }

    Derived(int a, int b) {
        super(a);
        System.out.println("I am an overloaded constructor of Derived with value of b: " + b);
    }
}

class childofDerived extends Derived {
    childofDerived() {
        super();
        System.out.println("I am a child of Derived constructor");
    }

    childofDerived(int a, int b, int c) {
        super(a, b);
        System.out.println("I am a child of Derived constructor with value of c: " + c);
    }
}

public class constructer_inheritantion {
    public static void main(String[] args) {

        Base b = new Base();
        System.out.println();

        Derived d1 = new Derived();
        System.out.println();

        Derived d2 = new Derived(11, 9);
        System.out.println();

        childofDerived cd1 = new childofDerived();
        System.out.println();

        childofDerived cd2 = new childofDerived(3, 7, 9);
    }
}
