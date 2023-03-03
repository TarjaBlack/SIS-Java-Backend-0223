import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // A Interface List deve ser implementada pela classe ArrayList.
        List ourList = new ArrayList<>();

        ourList.add("Felipe");
        ourList.add("Roberta");
        ourList.add("Jorge");
        ourList.add("Juliana");
        ourList.add("Ricardo");

        System.out.println("List size: " + ourList.size());

        System.out.println("Accessing the list with FOR:");
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));
        }

        System.out.println("Accessing the list with FOR - desc:");
        for (int i = ourList.size() - 1; i >= 0; i--) {
            System.out.println(ourList.get(i));
        }

    }
}