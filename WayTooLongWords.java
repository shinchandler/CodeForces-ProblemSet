import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            if (str.length() > 10) {
                System.out.println(str.charAt(0) + String.valueOf(str.length() - 2) + str.charAt(str.length() - 1));
            } else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
