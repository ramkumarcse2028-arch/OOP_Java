/* Question -> Ccreate a class cellphone with method to print "ringing..." , " vibrating..." ect */
class cellphone {

    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling Friend...");
    }
}
public class create_class_cellphone {
    public static void main(String[] args) {
        cellphone asus = new cellphone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }
}


