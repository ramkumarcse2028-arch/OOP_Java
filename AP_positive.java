// print AP 4, 7, 10, 13....................... n times 
import java.util.Scanner;
public class AP_positive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        /*int a = 4;
        for(int i=1; i<=n; i++){

            System.out.println(a);
            a +=3;
        }*/




        // print Ap 5, 2, -1, -4................. n times 
        /*  int a = 5;
        for(int i=1; i<=n; i++){

            System.out.println(a);
            a -=3; 
        } */



        // Print GP 1, 2, 4, 8, 16, 32, 64........................n times 
        int a = 1; // start me jo  digit hoga usi se inilazation karte hai 
        for(int i=1; i<=n; i++){

            System.out.println(a);
            a *= 2; // kitna guna ka different hai wo likhaya jata hai 
        } 




        

        
    }
    

    
}
