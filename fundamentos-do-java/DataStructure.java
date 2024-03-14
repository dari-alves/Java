import java.util.ArrayList;
import java.util.List;

public class DataStructure {
    public static void main(String[] args) {
        // List
        List<String> names = new ArrayList<>();
        names.add("Goku");
        names.add("Vegeta");
        names.add("Kuririn");

        // System.out.println(names.get(0));

        // for (String name : names) {
        //     System.out.println("Name: " + name);
        // }

        // names.forEach(name -> System.out.println(name));

        names.forEach(System.out::println);
    }
}
