package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPract {
    public static void main(String[] args) {
        List<String> home = new ArrayList();
        home.add("water");
        home.add("Food");
        home.add("Television");
        home.add("Kitchen");
        System.out.println(home);
    }
}
class CollectLinkedln{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Gari");
        list.add("Milk");
        list.add("cornflakes");

        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.lastIndexOf("cornflakes");
        System.out.println(list);
        list.addFirst("Sugar");
        System.out.println(list);

    }

}
