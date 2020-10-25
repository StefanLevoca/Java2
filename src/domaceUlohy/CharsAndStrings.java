package domaceUlohy;

import java.util.regex.Pattern;

public class CharsAndStrings {

    public void transformString(String string) {
        Pattern pattern = Pattern.compile("\\s+");
        String[] words = pattern.split(string);
        for (String str : words) {
            System.out.print(str.substring(0, str.length() - 1).toLowerCase() + str.substring(str.length() - 1).toUpperCase() + " ");
        }
        System.out.println();
    }

    public void replaceChars(String string) {
        System.out.println(string.replaceAll("a", "@"));
    }

    public void removeStrings(String string) {
        int lastComma = string.lastIndexOf(",");
        System.out.println(string.substring(0, lastComma));
    }

    public void replaceString(String string) {
        int firstComma = string.indexOf(",");
        int secondComma = string.indexOf(",", firstComma + 1);
        System.out.println(string.substring(0, firstComma) + string.substring(secondComma + 1));
    }

    public void informationAboutString(String string) {
        Pattern pattern = Pattern.compile("\\s+");
        String[] words = pattern.split(string);
        System.out.println("Pocet slov textu: " + words.length);
        System.out.println("Pocet znakov textu: " + string.length());
        int whiteSpaces, fullStops, commas, capitalLetters;
        whiteSpaces = fullStops = commas = capitalLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            if (chars == ' ') {
                whiteSpaces++;
            }
            if (chars == '.') {
                fullStops++;
            }
            if (chars == ',') {
                commas++;
            }
        }
        for (String s : words) {
            String str = s.substring(0, 1);
            if (str.matches("[A-Z]")) {
                capitalLetters++;
            }
        }
        System.out.println("Pocet prazdnych znakov textu: " + whiteSpaces);
        System.out.println("Pocet ciarok v texte: " + commas);
        System.out.println("Pocet bodiek v texte: " + fullStops);
        System.out.println("Pocet slov textu zacinajucich na velke pismeno: " + capitalLetters);
    }

    public void editString(String string) {
        String words = string.replaceAll("[,.]", "");
        for (int i = 0; i < words.length(); i++) {
            char letters = words.charAt(i);
            if (i % 2 == 0) {
                letters = Character.toUpperCase(letters);
            } else {
                letters = Character.toLowerCase(letters);
            }
            System.out.print(letters);
        }
        System.out.println();
    }

    public void initialChars(String name) {
        Pattern pattern = Pattern.compile("\\s+");
        String[] words = pattern.split(name);
        String output = "";
        for (String str : words) {
            output += (str.substring(0, 1) + ".");
        }
        System.out.println(output.substring(0, output.length() - 1));
    }

    public void transformCode(String text) {
        System.out.println(text.replaceAll("\\[code]", "<code>").replaceAll("\\[/code]", "</code>")
                .replaceAll("\\[header]", "<h1>").replaceAll("\\[/header]", "</h1>")
                .replaceAll("\\[link:(.*?)]", "<a href = \"$1\">").replaceAll("\\[/link]", "</a>"));
    }

    public static void main(String[] args) {
        CharsAndStrings charsAndStrings = new CharsAndStrings();
        System.out.println("Tasks 1");
        charsAndStrings.transformString("Napíš metódu ktorá transformuje vstupný text tak že všetky písmená budú malým písmenom okrem posledných písmen slov.");
        System.out.println("Tasks 2");
        charsAndStrings.replaceChars("Napíš metódu, ktorá nahradí každé písmeno a za @ na vstupnom texte.");
        System.out.println("Tasks 3");
        charsAndStrings.removeStrings("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        System.out.println("Tasks 4");
        charsAndStrings.replaceString("Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.");
        System.out.println("Tasks 5");
        charsAndStrings.informationAboutString("Napíš metódu, ktorá na vstupe zoberie dlhší text. Metóda rozoberie daný text a spraví z neho štatistiky. Metóda vypíše nasledovné informácie o texte.");
        System.out.println("Tasks 6");
        charsAndStrings.editString("Napíš metódu, ktorá na vstupe zoberie text. Tento text prerobí tak, že odstráni čiarky a bodky a každé druhé písmeno dá ako uppercase.");
        System.out.println("Tasks 7");
        charsAndStrings.initialChars("František Ferdinand Veľký");
        System.out.println("Tasks 8");
        charsAndStrings.transformCode("[header]Ac mi[/header] massa ac [code]praesent eget[/code], aliquam egestas suscipit, potenti massa," +
                " porttitor [link:www.learn2code.sk] gravida quis ac velit facilisi[/link], imperdiet massa rhoncus " +
                "[link:www.google.sk] felis arcu[/link]. Ut nullam, mauris vitae, ligula quisque est.");
    }
}
