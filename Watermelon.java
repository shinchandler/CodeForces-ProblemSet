import java.util.*;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        if (weight % 2 == 0 && weight > 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}