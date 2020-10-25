package domaceUlohy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleAndDates {

    public void task1() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Zadaj nejaký text, alebo malé či veľké písmeno q: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Vypínam...");
                break;
            } else {
                System.out.printf("Zadal si: %s %n", input);
            }
        }
        scanner.close();
    }

    public void task2() {
        Scanner scanner = new Scanner(System.in);
        String surnameFromConsole;
        String lastnameFromConsole;
        while (true) {
            System.out.println("Zadajte meno: ");
            surnameFromConsole = scanner.nextLine();
            if (surnameFromConsole.trim().isEmpty()) {
                System.out.println("Chybný vstup.");
                continue;
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Zadajte priezvisko: ");
            lastnameFromConsole = scanner.nextLine();
            if (lastnameFromConsole.trim().isEmpty()) {
                System.out.println("Chybný vstup.");
                continue;
            } else {
                break;
            }
        }
        scanner.close();
        Osoba osoba = new Osoba(surnameFromConsole, lastnameFromConsole);
        osoba.displayName();
    }

    public void task3() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Zadajte číslo: ");
        input = scanner.nextLine();
        if (!input.matches("^[0-9]\\d*$")) {
            System.out.println("Chybný vstup.");
        } else {
            System.out.printf("Zadali ste číslo: %s %n", input);
        }
        scanner.close();
    }

    public void task4() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Zadajte jednu z týchto operácií spolu aj s číslami (+, -, *, /), pričom desatiny oddeľte bodkou: ");
        input = scanner.nextLine();
        scanner.close();
        input = input.replaceAll("\\s", "");
        if (!input.matches("^((([0-9])|([1-9]\\d*))|((0\\.\\d+)|([1-9]\\d*\\.\\d+)))(\\+|-|\\*|/)((([0-9])|([1-9]\\d*))|((0\\.\\d+)|([1-9]\\d*\\.\\d+)))$")) {
            System.out.println("Chybný vstup.");
            return;
        }
        Pattern operationPattern = Pattern.compile("\\+|-|\\*|/");
        Matcher operationMatcher = operationPattern.matcher(input);
        String operation;
        operationMatcher.find();
        operation = operationMatcher.group();
        Pattern operandPattern = Pattern.compile("\\d+\\.?\\d*");
        Matcher operandMatcher = operandPattern.matcher(input);
        String operands[] = new String[2];
        int position = 0;
        while (operandMatcher.find()) {
            operands[position] = operandMatcher.group();
            position++;
        }
        double result;
        switch (operation) {
            case "+":
                result = Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]);
                System.out.printf("Výsledok je %f %n", result);
                break;
            case "-":
                result = Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]);
                System.out.printf("Výsledok je %f %n", result);
                break;
            case "*":
                result = Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]);
                System.out.printf("Výsledok je %f %n", result);
                break;
            case "/":
                if (Double.parseDouble(operands[1]) == 0.0) {
                    System.out.println("Chyba - nedá sa deliť nulou.");
                    return;
                }
                result = Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]);
                System.out.printf("Výsledok je %f %n", result);
                break;
        }
    }

    public void task5(LocalTime timeOfArrival) {
        System.out.printf("Z práce môžete odísť od %s %n", timeOfArrival.plusHours(8));
    }

    public void task6(LocalTime timeOfArrival, int workHours) {
        System.out.printf("Z práce môžete odísť od %s %n", timeOfArrival.plusHours(workHours));
    }

    public void task7() {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte dátum svojho narodenia vo formáte dd.mm.yyyy: ");
        input = scanner.nextLine();
        scanner.close();
        if (!input.matches("(0[1-9]|[1-2][0-9]|3[0-1])\\.([1-9]|1[0-2])\\.\\d{4}")) {
            System.out.println("Chybný vstup.");
            return;
        }
        LocalDate birthday = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        int yearsBetween = LocalDate.now().getYear() - birthday.getYear();
        String dayOfWeek;
        String wordYears;
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    wordYears = "rok";
                    break;
                case 1:
                case 2:
                case 3:
                    wordYears = "roky";
                    break;
                default:
                    wordYears = "rokov";
            }
            switch (birthday.plusYears(i + 1 + yearsBetween).getDayOfWeek()) {
                case MONDAY:
                    dayOfWeek = "v pondelok";
                    break;
                case TUESDAY:
                    dayOfWeek = "v utorok";
                    break;
                case WEDNESDAY:
                    dayOfWeek = "v stredu";
                    break;
                case THURSDAY:
                    dayOfWeek = "vo štvrtok";
                    break;
                case FRIDAY:
                    dayOfWeek = "v piatok";
                    break;
                case SATURDAY:
                    dayOfWeek = "v sobotu";
                    break;
                case SUNDAY:
                    dayOfWeek = "v nedeľu";
                    break;
                default:
                    dayOfWeek = "";
            }
            System.out.printf("O %d %s budeš mať narodeniny %s. %n", i + 1, wordYears, dayOfWeek);
        }
    }

    public void task8() {
        LocalDate todayDate = LocalDate.now();
        String holiday;
        switch (todayDate.format(DateTimeFormatter.ofPattern("dd.MM"))) {
            case "01.01":
                holiday = "je Deň vzniku Slovenskej republiky";
                break;
            case "06.01":
                holiday = "je sviatok Zjavenia Pána (traja králi)";
                break;
            case "30.03":
                holiday = "je Veľký piatok";
                break;
            case "02.04":
                holiday = "je Veľkonočný pondelok";
                break;
            case "01.05":
                holiday = "je Sviatok práce";
                break;
            case "08.05":
                holiday = "je Deň víťazstva nad fašizmom";
                break;
            case "05.07":
                holiday = "je Sviatok svätého Cyrila a Metoda";
                break;
            case "29.08":
                holiday = "je výročie SNP";
                break;
            case "01.09":
                holiday = "je Deň Ústavy Slovenskej republiky";
                break;
            case "15.09":
                holiday = "je Sviatok sedembolestnej Panny Márie";
                break;
            case "01.11":
                holiday = "je Sviatok všetkých svätých";
                break;
            case "17.11":
                holiday = "je Deň boja za slobodu a demokraciu";
                break;
            case "24.12":
                holiday = "je Štedrý deň";
                break;
            case "25.12":
                holiday = "je Prvý sviatok vianočný";
                break;
            case "26.12":
                holiday = "je Druhý sviatok vianočný";
                break;
            default:
                holiday = "nie je žiadny štátny alebo cirkevný sviatok";
        }
        System.out.printf("Dnes %s. %n", holiday);
    }

    public static void main(String[] args) {
        ConsoleAndDates consoleAndDates = new ConsoleAndDates();
        // consoleAndDates.task1();
        // consoleAndDates.task2();
        // consoleAndDates.task3();
        // consoleAndDates.task4();
        // consoleAndDates.task5(LocalTime.parse("07:52"));
        // consoleAndDates.task6(LocalTime.parse("07:52"), 8);
        // consoleAndDates.task7();
         consoleAndDates.task8();
    }
}
