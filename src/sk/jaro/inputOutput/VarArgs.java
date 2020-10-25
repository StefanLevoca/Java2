package sk.jaro.inputOutput;

public class VarArgs {
    public static void main(String[] args) {
        int max = max("sadfa",1,2,3,10,0,15,17,100,1597,-4567);

        System.out.println(max("jaro"));
    }

    private static int max(String s, int... values) {
        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }


}
