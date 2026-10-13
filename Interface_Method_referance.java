import java.util.function.*;
public class Interface_Method_referance {
    public static void main(String[] args) {
        Predicate<Integer> isGreater = x -> x > 100;
        Predicate<Integer> isEven = x -> x % 2 == 0;

       // System.out.println(isGreater.or(isEven).test(50));

       Predicate<Integer> isOdd = isEven.negate();
       System.out.println(isOdd.test(75));

       // and() -> &&
       // or() -> ||
       // negate()  -> !
    }
}
