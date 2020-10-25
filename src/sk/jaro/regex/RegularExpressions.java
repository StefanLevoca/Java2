package sk.jaro.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
//        uvod();
//        prehladavanie();
//        greedyReluctantPossesiveQuantifier();
//        boundaryMatchers();
        splitRegex();

    }

    private static void uvod() {
        //        zhoda
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z]ro");
        Matcher m = p.matcher("fero");
        System.out.println(m.matches());
        System.out.println("______________");
    }

    private static void prehladavanie() {
        //zero lenght matches
//        displayResults("9*","");

//        displayResults("9*"," a a");
//
//        displayResults("9{4}","99");
//
//        displayResults("9*","");
//
//        displayResults("9{4}","99999");
//
//        displayResults("9{4}","99999999");
//
//        displayResults("[abc]{3}","abccabaaaccbbbc");
//
        displayResults("","");
        //* 0-x krat
        //+ 1-x krat
        // {}
        // []


    }

    private static void greedyReluctantPossesiveQuantifier() {
        System.out.println("gready:");
        displayResults("foo.*bar","xfooxxbarxxxxfooxbarxxxx");

        System.out.println("reluctant:");
        displayResults("foo.*?bar","xfooxxbarxxxxfooxbarxxxx");

        System.out.println("possesive:");
        displayResults("foo.*+bar","xfooxxbarxxxxfooxbarxxxx");
    }

    private static void boundaryMatchers() {
//        displayResults("^hus","Hus sa hrá na pozemku.");
//        displayResults("^hus","hus sa hrá na pozemku.");
//        displayResults("^[hH]us","Hus sa hrá na pozemku.");
//        displayResults("^[hH]us","hus sa hrá na pozemku.");
//        displayResults("^hus","Moja hus sa hrá na pozemku.");
//
        displayResults("\\qbhus\\B","Moja huska sa hrá na pozemku.");
    }

    private static void splitRegex() {
        String regex = ":";
        String text = "jeden:dva:tri:styri:pat";
        Pattern p = Pattern.compile(regex);
        String[] items = p.split(text);
//        for(String s : items) {
//            System.out.println(s);
//        }

        regex = "\\d";
        text = "jeden4dva7tri9styri1pat";
        p = Pattern.compile(regex);
        items = p.split(text);
        for(String s : items) {
            System.out.println(s);
        }
        String[] s = text.split(regex);
        System.out.println(s.length);

        System.out.println("dfjsafkds".matches("\\w*"));

        //jaro@jaro.sk
        // \w+@\w+\.sk
        regex = "\\w+@\\w+\\.sk";
        System.out.println("jaro@jaro.sk".matches(regex));

    }

    private static void displayResults(String pattern, String text) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean found = false;
        //ak nebude na konzole nic tak sa nic nenaslo
        while (m.find()) {
            System.out.println("Našiel som text: " + m.group());
            System.out.println("začiatok: " + m.start());
            System.out.println("koniec: " + m.end());
            System.out.println("______________");
            found = true;
        }
        if (!found) {
            System.out.println("Nič som nenašiel");
            System.out.println("______________");
        }
    }

}
