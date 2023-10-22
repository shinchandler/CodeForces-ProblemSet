// import java.util.*;

// public class NextRound {
//     public static void main(String[] args) {
//         int count = 0;
//         Scanner sc = new Scanner(System.in);
//         int contestants = sc.nextInt();
//         int position = sc.nextInt();
//         sc.nextLine();

//         for (int i = 1; i <= contestants; i++) {
//             int score = sc.nextInt();
//             count++;
//             if(i==position){

//             }

//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int contestants = sc.nextInt();
        int position = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[contestants];
        for (int i = 0; i < contestants; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < contestants; i++) {
            if (arr[i] >= arr[position - 1] && arr[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}