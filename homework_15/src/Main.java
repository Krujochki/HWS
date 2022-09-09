import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {
        try {
            List<Integer> l1 = new ArrayList<>();
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            l1.add(new Random().nextInt(1000));
            System.out.println(l1);
            Stream st = l1.stream().filter(x-> x % 2 == 0);
            List<Integer> result = new ArrayList<>((Collection) st.collect(Collectors.toList()));
            System.out.println(result);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter letter length");
            int x = sc.nextInt();
            CheckString checkLength = l -> l.length() < x;
            CheckString checkLetter = l -> l.contains("o");
        }
        catch (Exception e) {
            System.out.println("Retry");
        }
    }
}
