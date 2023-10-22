import java.util.*;

public class BitPP {
    public static void main(String[] args) {
        int X = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("++")) {
                X++;
            } else {
                X--;
            }
        }
        System.out.println(X);
        ;
        sc.close();
    }
}
