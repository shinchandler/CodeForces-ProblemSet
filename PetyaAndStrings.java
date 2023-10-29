import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();

        int result = (first.compareToIgnoreCase(second));

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}