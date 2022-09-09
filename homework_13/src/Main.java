import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Predator");
        Animal animal1 = new Animal("Herbivore");
        Animal animal2 = new Animal("Herbivore");
        Animal animal3 = new Animal("Predator");
        Map<String, Animal> map = new HashMap();
        map.put("Animal",animal);
        map.put("Animal1",animal1);
        map.put("Animal2",animal2);
        map.put("Animal3",animal3);

        Map<String,Animal> map1 = new TreeMap<>();
        Map<String,Animal> map2 = new LinkedHashMap<>();

        map.forEach((k,v) -> {
            if (v.tipe == "Predator") {
                map1.put(k,v);
            }
            if (v.tipe == "Herbivore") {
                map2.put(k,v);
            }
        });
    }
}
