package sk.jaro;

public class Chars {
    public static void main(String[] args) throws InterruptedException {
//        char ch = 'a';
//        // Unicode for uppercase Greek omega character
//        char uniChar = '\u03A9';
//        System.out.println(uniChar);
//        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
//
//        String s = new String(charArray);
//        System.out.println(s);
//
//        Character ch2 = ch;
//        ch = ch2;
//
        Character ch3 = 'a';
//
//        System.out.println("char "+ch);
//        System.out.println("isLetter "+Character.isLetter(ch));
//        System.out.println("isDigit "+Character.isDigit(ch));
//        System.out.println("isWhitespace "+Character.isWhitespace(ch));
//        System.out.println("isUpperCase "+Character.isUpperCase(ch));
//        System.out.println("isLowerCase "+Character.isLowerCase(ch));
//        System.out.println("toUpperCase "+Character.toUpperCase(ch));
//        System.out.println("toLowerCase "+Character.toLowerCase(ch));
//        System.out.println("toString "+Character.toString(ch));
//        System.out.println();

        System.out.println("Some \t nice text. tab");
        System.out.println("Some \t\b nice text. backspace");
        System.out.println("Some \n nice text. new line");

        //je to nieco ako na starom písacom stroji kedy si sa presunul na zaciatok riadku
        //ak nedáš ale nový riadok, tak ti prepíše to čo tam už máš napísané
        System.out.println("Some \r nice text. carriage return");
        System.out.println("Some \r\n nice text. carriage return a new line");
        System.out.println("Some \' nice text. ");
//        char uvodzovka = '''; //error
        char uvodzovka = '\'';
//        System.out.println("Some " nice text."); //error
        System.out.println("Some \" nice text.");
//        System.out.println("Some \ nice text."); //error
        System.out.println("Some \\ nice text.");


    }
}
