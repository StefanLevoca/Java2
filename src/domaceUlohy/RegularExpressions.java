package domaceUlohy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public boolean checkEmailAddress(String email) {
        return email.matches("[a-zA-Z]*\\d*[\\.]?[a-zA-Z]*\\d*@[a-z]*\\d*\\.([a-z]{2}|[a-z]{3})");
    }

    public boolean checkPasssword(String password) {
        Pattern patternString = Pattern.compile("[A-Z]+");
        Matcher matcherString = patternString.matcher(password);
        Pattern patternNumber = Pattern.compile("\\d+");
        Matcher matcherNumber = patternNumber.matcher(password);
        Pattern patternLength = Pattern.compile("\\w{8,}");
        Matcher matcherLength = patternLength.matcher(password);
        return matcherString.find() && matcherNumber.find() && matcherLength.find();
    }

    public boolean checkFile(String file) {
        Pattern patternSuffix = Pattern.compile("(^|\\b)\\w*\\.((jpg)|(png)|(jpeg)|(bmp))(\\b|$)");
        Matcher matcherSuffix = patternSuffix.matcher(file);
        return matcherSuffix.find();
    }

    public boolean checkDate(String date) {
        return date.matches("(([0-2][1-9])|([1-2][0])|(3[0-1]))/(([0][1-9])|(1[0-2]))/\\d\\d\\d\\d");
    }

    public void findWordsWithStartingUppercaseCharacter(String string) {
        Pattern patternWord = Pattern.compile("[A-Z]\\w+");
        Matcher matcherWord = patternWord.matcher(string);
        boolean found = false;
        while (matcherWord.find()) {
            if (!found) {
                System.out.print("Najdene slova: ");
            }
            System.out.print(matcherWord.group() + " ");
            found = true;
        }
        if (!found) {
            System.out.print("V zadanom texte nie su ziadne slova zacinajuce velkym pismenom.\n");
        }
    }

    public void findNumbers(String string) {
        Pattern patternNumber = Pattern.compile("\\d+");
        Matcher matcherNumber = patternNumber.matcher(string);
        boolean fonud = false;
        while (matcherNumber.find()) {
            if (!fonud) {
                System.out.print("Najdene cisla: ");
            }
            System.out.print(matcherNumber.group() + " ");
            fonud = true;
        }
        if (!fonud) {
            System.out.print("V zadanom texte nie su ziadne cisla.\n");
        }
    }

    public static void main(String[] args) {
        RegularExpressions regExpr = new RegularExpressions();
        System.out.println("Je email korektny: " + regExpr.checkEmailAddress("jankohrasko@gmail.com"));
        System.out.println("Je heslo korektne: " + regExpr.checkPasssword("HesLo281"));
        System.out.println("Ma obrazok korektnu priponu: " + regExpr.checkFile("obrazok.jpeg"));
        System.out.println("Je datum korektne zapisany: " + regExpr.checkDate("02/11/1991"));
        regExpr.findWordsWithStartingUppercaseCharacter("Tu ale Naozaj nic Nie je Bodka");
        regExpr.findWordsWithStartingUppercaseCharacter("kjddhdjcbdjb jhcbddhjcbdsj jcbdbcjhb");
        regExpr.findNumbers("23gad89");
        regExpr.findNumbers("Ziadne cisla");
    }
}

