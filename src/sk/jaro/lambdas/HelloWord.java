package sk.jaro.lambdas;

public class HelloWord {
    public void printHelloWord(){
        System.out.println("Hello Word");
    }




    public void printHelloWord2(HelloWordFunctions helloWordFunctions){
        helloWordFunctions.sayHello();
    }

//    public void printHelloWord(funkcia){
//        funkcia();
//    }


    public static void main(String[] args) {
        HelloWord helloWord1 = new HelloWord();
        helloWord1.printHelloWord();

        helloWord1.printHelloWord2(() -> System.out.println("HelloWord impls"));

        String meno = "Jaro";

    }

//    premennaSFunkciou = ;
//

    class HelloWordC implements HelloWordFunctions{
        @Override
        public void sayHello() {
            System.out.println("Hello Word.");
        }
    }
}
