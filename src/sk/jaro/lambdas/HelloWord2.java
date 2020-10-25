package sk.jaro.lambdas;

public class HelloWord2 {
    public void printHelloWord2(Lambda printHello){
        printHello.print();
    }

    public static void main(String[] args) {
        Lambda printHello = () -> System.out.println("Hello Word");
        HelloWord2 helloWord = new HelloWord2();
        helloWord.printHelloWord2(printHello);
    }

    //    bezpecneDelenie = (int a, int b) -> {
//        if(b==0){
//            return 0;
//        }
//        return a/b;
//    }
}
