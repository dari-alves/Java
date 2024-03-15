import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        Map<String, Integer> powers =  new HashMap<>();
        powers.put("Goku", 9000);
        powers.put("Vegeta", 8800);
        powers.put("Kuririn", 1000);

        // var power1 = powers.get("Goku");

        // System.out.println(power1);

        for(Map.Entry<String, Integer> entry : powers.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // System.out.println(entry);
            System.out.println("The key is " + key + " and the value is " + value);
        }

    }
}
