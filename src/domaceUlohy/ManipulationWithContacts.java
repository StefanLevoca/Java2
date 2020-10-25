package domaceUlohy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManipulationWithContacts {

    public void addContact(Contact contact) throws IOException {
        List<String> contactList = new ArrayList<>();
        String nameOfDatabase;
        int numberOfConcats;
        String listOfNeededData;

        //nacitanie dat zo suboru
        try (Scanner scanner = new Scanner(new FileInputStream("resources/listOfContacts.txt"))) {
            //meno databazy
            nameOfDatabase = scanner.nextLine().trim();
            // System.out.println(nameOfDatabase);
            //pocet kontaktov
            numberOfConcats = Integer.parseInt(scanner.nextLine().trim());
            // System.out.println(numberOfConcats);
            //zoznam názvov údajov oddelených bodkočiarkou
            listOfNeededData = scanner.nextLine().trim();
            // System.out.println(listOfNeededData);
            //nacitanie uz zapisanych zaznamov
            for (int i = 0; i < numberOfConcats; i++) {
                contactList.add(scanner.nextLine());
            }
        }

        //zapis dat do suboru
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("resources/listOfContacts.txt"))) {
            printWriter.println(nameOfDatabase);
            printWriter.println(numberOfConcats + 1);
            printWriter.println(listOfNeededData);
            for (String record : contactList) {
                printWriter.println(record);
            }
            printWriter.print(contact.getName() + "; " + contact.getPhoneNumber() + "; " + contact.getMobileNumber() + "; " + contact.getEmail());
            System.out.printf("Pridany zaznam do databazy: %s%n", contact);
        }
    }

    public void listContacts() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("resources/listOfContacts.txt"))) {
            List<String> contactList = new ArrayList<>();
            //meno databazy
            String nameOfDatabase = scanner.nextLine().trim();
            // System.out.println(nameOfDatabase);
            //pocet kontaktov
            int numberOfConcats = Integer.parseInt(scanner.nextLine().trim());
            // System.out.println(numberOfConcats);
            //zoznam názvov údajov oddelených bodkočiarkou
            String listOfNeededData = scanner.nextLine().trim();
            // System.out.println(listOfNeededData);
            for (int i = 0; i < numberOfConcats; i++) {
                contactList.add(scanner.nextLine().trim());
            }
            for (String record : contactList) {
                System.out.println(record);
            }
        }
    }

    public void searchContact(String searchedName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("resources/listOfContacts.txt"))) {
            //meno databazy
            String nameOfDatabase = scanner.nextLine().trim();
            // System.out.println(nameOfDatabase);
            //pocet kontaktov
            int numberOfConcats = Integer.parseInt(scanner.nextLine().trim());
            //  System.out.println(numberOfConcats);
            //zoznam názvov údajov oddelených bodkočiarkou
            String listOfNeededData = scanner.nextLine().trim();
            // System.out.println(listOfNeededData);
            List<String> records = new ArrayList<>();
            for (int i = 0; i < numberOfConcats; i++) {
                records.add(scanner.nextLine().trim());
            }
            List<Contact> contactList = new ArrayList<>();
            for (String record : records) {
                String[] items = record.split(";");
                String name = items[0].trim();
                String phoneNumber = items[1].trim();
                String mobileNumber = items[2].trim();
                String email = items[3].trim();
                contactList.add(new Contact(name, phoneNumber, mobileNumber, email));
            }
            List<Contact> foundContacts = new ArrayList<>();
            for (Contact contact : contactList) {
                if (contact.getName().contains(searchedName)) {
                    foundContacts.add(contact);
                }
            }
            if (!foundContacts.isEmpty()) {
                for (Contact found : foundContacts) {
                    System.out.printf("Kontakt najdeny: %s%n", found);
                }
            } else {
                System.err.println("Kontakt sa v zaznamoch nenachadza");
            }
        }
    }

    public int chooseAction() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Zadaj cislo pre akciu so zaznamami: \n 1 pre vypis zaznamov \n 2 pre vlozenie noveho zaznamu \n 3 pre vyhladanie zaznamu v databaze");
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice < 1 || choice > 3) {
                System.err.println("Nepodarilo sa načítať počet prislusnu akciu na vykonanie. Zadal si správne číslo?");
                choice = chooseAction();
            }
            switch (choice) {
                case 1:
                    System.out.println("Vypis zaznamov z databazy");
                    System.out.println("---------------------------");
                    listContacts();
                    break;
                case 2:
                    System.out.println("Vlozenie noveho zaznamu do databazy");
                    System.out.println("---------------------------");
                    System.out.println("Zadaj novy zaznam v tvare: \n Meno \n Telefón \n Mobil \n Email");
                    addContact(new Contact(scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim()));
                    break;
                case 3:
                    System.out.println("Vyhladanie zaznamu v databaze");
                    System.out.println("---------------------------");
                    System.out.println("Zadaj hladane meno:");
                    searchContact(scanner.nextLine().trim());
                    break;
            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.err.println("Nepodarilo sa načítať subor");
        } catch (IOException e) {
            //  e.printStackTrace();
            System.err.println("Vstupno-vystupna chyba prace so suborom");
        } catch (Exception e) {
            // e.printStackTrace();
            System.err.println("Nepodarilo sa načítať prislusnu akciu");
            choice = chooseAction();
        }
        return -1;
    }

    public static void main(String[] args) {
        ManipulationWithContacts manipulationWithContacts = new ManipulationWithContacts();
        manipulationWithContacts.chooseAction();
    }
}
