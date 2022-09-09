import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(1000)-100;
            }
        }

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int[] e: matrix) {
            for (int i : e){
                if (i < 0){
                    negative.add(i);
                }
                if (i > 0){
                    positive.add(i);
                }
            }
        }

        System.out.println("Positive numbers:");

        for (int e : positive) {
            System.out.println(e);
        }

        System.out.println("Negative numbers:");

        for (int e: negative) {
            System.out.println(e);
        }
    }
}
