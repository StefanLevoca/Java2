package sk.jaro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add("list5");

        list.get(list.size()-1);

        list.isEmpty();
        list.add(2,"list2b");
        list.remove("list1");
        list.remove(4);

        Collections.sort(list);
        Collections.shuffle(list);
        Collections.reverse(list);

        Collections.rotate(list,2);
        Collections.swap(list, 0, 1);
        Collections.replaceAll(list, "list4", "new list4");
        Collections.fill(list,"Jaro");
    }
}
