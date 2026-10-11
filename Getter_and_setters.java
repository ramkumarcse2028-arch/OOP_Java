class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Getter_and_setters {
    public static void main(String[] args) {
        MyEmployee ram = new MyEmployee();
        // ram.id = 45;
        // ram.name = "RamKumar"; --> Throws an error due to private access modifier
        ram.setName("RamKumar");
        System.out.println(ram.getName());
        ram.setId(234);
        System.out.println(ram.getId());
        
    }
}
