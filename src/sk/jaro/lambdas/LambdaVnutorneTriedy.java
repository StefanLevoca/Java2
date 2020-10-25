package sk.jaro.lambdas;

public class LambdaVnutorneTriedy {
    public static void main(String[] args) {
//        Lambda lambda = () ->  System.out.println("hello word from inner class");

//        Lambda lambda2 = new Lambda() {
//            @Override
//            public void print() {
//                System.out.println("hello word from inner class lambda 2");
//            }
//        };

        pritnIt(() ->  System.out.println("hello word from inner class"));


//        pritnIt(lambda2);
    }

    public static void pritnIt(Lambda lambda){
        lambda.print();
    }
}
