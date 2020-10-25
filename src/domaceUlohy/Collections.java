package domaceUlohy;

import sk.jaro.utils.Osoba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Collections {

    /**
     * napíš program, kde si vytvoríš zoznam mien, ktorý vypíšeš na konzolu
     *
     * @param list
     */
    private void task1(List<String> list) {
        System.out.println("TASK1");
        System.out.println(list);
    }

    /**
     * napíš program, ktorá ti vloží element (napríklad String meno) na prvé miesto v zozname mien
     *
     * @param list
     * @param name
     */
    private void task2(List<String> list, String name) {
        System.out.println("TASK2");
        list.add(0, name);
        System.out.println(list);
    }

    /**
     * napíš program, ktorí má niekoľko elementov, napríklad mien a nahradíš meno na druhej pozícii iným menom
     *
     * @param list
     * @param name
     */
    private void task3(List<String> list, String name) {
        System.out.println("TASK3");
        list.remove(1);
        list.add(1, name);
        System.out.println(list);
    }

    /**
     * napíš metódu, ktorá na vstupe bude mať zoznam mien a meno,
     * ktoré sa pokúsiš vyhľadať v zozname. Metóda zistí, či sa daný
     * element (napr. meno) nachádza v zozname alebo nie. Ak áno vráti
     * jeho pozíciu ako návratovú hodnotu
     *
     * @param list
     * @param name
     * @return
     */
    private int task4(List<String> list, String name) {
        System.out.println("TASK4");
        return list.contains(name) ? list.indexOf(name) : -1;
    }

    /**
     * použi metódu z úlohy 4. Vrátenú pozíciu použi na to aby si načítal
     * daný element zo zoznamu a vypísal ho na konzolu. Potom vyskúšaj do
     * metódy v úlohe 4 zadať také meno, ktoré sa tam nenachádza a postupuj
     * tak, ako v úlohe 5. Vyskúšaš si ako si poradiť s neznámym indexom.
     * Ako to vyriešiš?
     *
     * @param list
     * @param name
     */
    private void task5(List<String> list, String name) {
        System.out.println("TASK5");
        int i = list.contains(name) ? list.indexOf(name) : -1;
        if (i != -1) {
            System.out.println(list.get(i));
        } else {
            System.out.println("Dane meno sa v zozname nenachadza");
        }
    }

    /**
     * napíš program, ktorý ti zotriedi prvky v kolekcii
     *
     * @param list
     */
    private void task6(List<String> list) {
        System.out.println("TASK6");
        java.util.Collections.sort(list);
        System.out.println(list);
    }

    /**
     * napíš program, ktorý pridá elementy z jednej kolekcie na koniec druhej kolekcie
     *
     * @param list
     * @param list2
     */
    private void task7(List<String> list, List list2) {
        System.out.println("TASK7");
        list.addAll(list2);
        System.out.println(list);
    }

    /**
     * napíš program, ktorý ti vymení dva elementy v kolekcii medzi sebou
     *
     * @param list
     */
    private void task8(List<String> list) {
        System.out.println("TASK8");
        java.util.Collections.swap(list, 0, 1);
        System.out.println(list);
    }

    /**
     * napíš program, ktorý ti zistí, či daná kolekcia je prázdna alebo nie
     *
     * @param list
     */
    private void task9(List<String> list) {
        System.out.println("TASK9");
        System.out.printf("Je kolekcia prazdna: %b%n", list.isEmpty());
    }

    /**
     * napíš program, ktorý ti vypíše elementy z kolekcie na konzolu. Elementy získaj pomocou indexu
     *
     * @param list
     * @param index
     */
    private void task10(List<String> list, int index) {
        System.out.println("TASK10");
        System.out.println(list.get(index));
    }

    /**
     * napíš program, ktorý použije HasMap<Integer, Osoba>.
     * Pridaj pár záznamov do danej kolekcii a vypíš prvky
     * danej kolekcie. Integer ber, že je to identifikátor Osoby
     * a Osoba je inštancia nejakej osoby
     *
     * @param map
     */
    private void task11(Map<Integer, Osoba> map) {
        System.out.println("TASK11");
        System.out.println(map);
    }

    /**
     * použi kolekciu z úlohy 11. Napíš program, ktorý zistí, či
     * v danej kolekcii je Osoba priradená k identifikátoru
     *
     * @param map
     * @param i
     * @param osoba
     */
    private void task12(Map<Integer, Osoba> map, int i, Osoba osoba) {
        System.out.println("TASK12");
        if (map.containsKey(i)) {
            if (map.get(i).equals(osoba)) {
                System.out.printf("Kluc %d patri osobe %s %n", i, map.get(i));
            } else {
                System.out.printf("Kluc %d patri inej osobe a to %s %n", i, map.get(i));
            }
        } else {
            System.out.println("Osoba s danym identifikatorom nenajdena");
        }
    }

    /**
     * napíš program, ktorý vloží Osoby z kolekcie osôb z úlohy 11 do ArrayListu
     *
     * @param map
     */
    private void task13(Map<Integer, Osoba> map) {
        System.out.println("TASK13");
        List<Osoba> list = new ArrayList<>(map.values());
        System.out.println(list);
    }

    /**
     * Napíš program, ktorý načíta riadky z textového súboru. Riadky ulož do kolekcie.
     * Jeden riadok = jeden záznam v kolekcii
     *
     * @param s
     * @throws FileNotFoundException
     */
    private void task14(String s) throws FileNotFoundException {
        System.out.println("TASK14");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(new FileInputStream(s));
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        System.out.println(list);
    }

    /**
     * napíš metódu, ktorá na vstupe bude akceptovať kolekciu typu Collection.
     * Vo vnútri metódy sa všetky elementy z kolekcie vypíšu na konzolu.
     * Pre predstavu použi napríklad dve kolekcie takto:
     * Collection<String> collection = new ArrayList<>();
     * Collection<String> collection2 = new HashSet<>();
     *
     * @param collection
     */
    private void task15(Collection collection) {
        System.out.println("TASK15");
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        Collections collections = new Collections();

        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Jaro");
        list.add("Stevo");
        list.add("Milan");
        list.add("Jozef");

        collections.task1(list);
        collections.task2(list, "Matus");
        collections.task3(list, "Jakub");

        System.out.println(collections.task4(list, "Stevo"));
        collections.task5(list, "Bonifac");
        collections.task6(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Pankrac");
        list2.add("Servac");
        list2.add("Bonifac");
        list2.add("Silvester");
        list2.add("Adam");

        collections.task7(list, list2);
        collections.task8(list);
        collections.task9(list);
        collections.task10(list, 2);

        Map<Integer, Osoba> map = new HashMap<>();
        Osoba o1 = new Osoba("Jaro", "Beno", 30);
        Osoba o2 = new Osoba("Stefan", "Levoca", 26);
        Osoba o3 = new Osoba("Jozef", "Zabudlivy", 28);
        Osoba o4 = new Osoba("Peter", "Sveter", 19);
        Osoba o5 = new Osoba("Milan", "Deka", 89);
        Osoba o6 = new Osoba("Jakub", "Svetlo", 37);
        map.put(1, o1);
        map.put(2, o2);
        map.put(3, o3);
        map.put(4, o4);
        map.put(5, o5);
        map.put(6, o6);

        collections.task11(map);
        collections.task12(map, 3, o3);
        collections.task13(map);
        try {
            collections.task14("resources/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        collections.task15(list);
        System.out.println();
        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("Jaro");
        set.add("Stevo");
        set.add("Milan");
        set.add("Jozef");
        collections.task15(set);
    }
}
