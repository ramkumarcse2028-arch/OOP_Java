/*  question -> create a class empolyee with following and method;
 Salary (property)(int)
 get Salary (method returning int)
 name (property)(string)
 get name(method returning string)
 set name(method changing name)  */


class empolyee {
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }  
 }
public class create_empolyee_property {
    public static void main(String[] args) {
        empolyee ram = new empolyee();
        ram.setName("ramkumar");
        ram.salary = 222;
        System.out.println(ram.getSalary());
        System.out.println(ram.getName());
    
    } 
}
