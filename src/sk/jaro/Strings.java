package sk.jaro;

public class Strings {

    public static void main(String[] args) {
        int i = 0;
        String s1 = "" + i;

        System.out.println(s1);

        String jaro = "jaro beno";
        System.out.println(jaro.length());
//        System.out.println(jaro.charAt(10));
        System.out.println(jaro.substring(1,3));

        System.out.println("---------------");
        System.out.println(jaro.indexOf(' '));
        System.out.println(jaro.indexOf("beno"));
        System.out.println(jaro.lastIndexOf('o'));
        System.out.println(jaro.contains("beno"));
        System.out.println(jaro.equals("jaro BENO"));
        System.out.println(jaro.equalsIgnoreCase("jaro BENO"));

        System.out.println("---------------------");
        System.out.println(jaro.replace("j","J"));
        System.out.println(jaro.replace('j','J'));
        System.out.println(jaro.replaceAll("o","O"));
        //regex budeme preberat neskor
        String text = "jaro ma 55 rokov 199 centimetrov";
        System.out.println(text.replaceAll("[0-9]","?"));

        String s5 = text.replaceFirst("[0-9]","?").toUpperCase();
        System.out.println(s5);



    }
}
