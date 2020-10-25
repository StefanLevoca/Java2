package sk.jaro.afterLambda;

//import javax.rmi.CORBA.Util;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
        doSomething("Jaro", System.out::println);

        //  (a,b)->UtilClass.sumIt(a,b)
        //  UtilClass::sumIt

        // ()->UtilClass.closeIt()
//         UtilClass::closeIt


        sumIt(10,20, UtilClass::sumIt);
    }

    public static <T> void doSomething(T item, Consumer<T> cosumer){
        cosumer.accept(item);
    }

    public static void sumIt(int a, int b, BiConsumer<Integer, Integer> biConsumer){
        biConsumer.accept(a,b);
    }
}
