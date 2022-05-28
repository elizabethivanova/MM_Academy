package DataStructures;

import java.util.LinkedList;

public class ReverseOrderLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Maya");
        names.add("Victoria");
        names.add("Daniel");

        System.out.println(names);

        LinkedList<String> reversedNames = new LinkedList<>();
        for (int i = names.size() - 1; i >= 0 ; i--) {
            reversedNames.add(names.get(i));
        }

        System.out.println(reversedNames);
    }
}
