package sk.jaro.lambdas;

public class LambdaExamples3 {

    public static void main(String[] args) {
        Nasob nasobPiatimi = a -> a*5;

        printNasob(a -> a*5);
    }

    interface Nasob{
        int nasob(int a);
    }

    public static void printNasob(Nasob nasob){
        System.out.println(nasob.nasob(10));
    }
}
