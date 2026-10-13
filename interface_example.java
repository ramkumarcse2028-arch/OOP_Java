interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class Avoncycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Apply Brake");
    }
    public void speedUp(int increment){
        System.out.println("Apply speedUp");
    }
    public void blowHornK3g(){
        System.out.println("kabhi kabhi");
    }
    public void blowHornmhn(){
        System.out.println("Hain hoon po po");
    }
}
public class interface_example {
    public static void main(String[] args) {
        Avoncycle cycleRam = new Avoncycle();
        cycleRam.applyBrake(1);
        // you can create properties in interface
        System.out.println(cycleRam.a);

        // you can not modify the properties in interface as they are final
        // cycleRam.a = 454;
        // System.out.println(cycleRam.a);

        cycleRam.blowHornK3g();
        cycleRam.blowHornmhn();
    }
    
}
