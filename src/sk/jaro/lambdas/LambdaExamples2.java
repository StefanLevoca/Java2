package sk.jaro.lambdas;

public class LambdaExamples2 {

//    bezpecneDelenie = (int a, int b) -> {
//        if(b==0){
//            return 0;
//        }
//        return a/b;
//    }

    public static void main(String[] args) {

        Hocijako hocijako = (int a, int b) -> {
            if(b==0){
                return 0;
            }
            return a/b;
        };

        double d = hocijako.hocico(10, 2);
        System.out.println(d);
    }

    interface Hocijako{
        double hocico(int x, int y);
    }
}
