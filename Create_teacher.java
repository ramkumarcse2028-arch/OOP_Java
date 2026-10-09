class teacher{
    int id;
    String name;
    String depatment;

    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepatment(){
        return depatment;
    }
    public void setName(String n){
        name = n;
    }


}
public class Create_teacher {
     public static void main(String[] args) {
        teacher ammul = new teacher();
        ammul.setName("ammulsharma");
        ammul.id = 444;
        ammul.depatment = "java";
        System.out.println(ammul.getid());
        System.out.println(ammul.getName());
        System.out.println(ammul.getDepatment());
    }
}
