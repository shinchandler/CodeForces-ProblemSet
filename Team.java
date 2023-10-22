import java.util.*;

public class Team {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if ((p + v + t) > 1) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
