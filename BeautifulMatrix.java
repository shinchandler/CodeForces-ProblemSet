import java.util.*;
import java.lang.*;

public class BeautifulMatrix{
	public static void main(String[] args){
		int move = 0;
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		// taking user input in the 2-D array
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		// traversing the 2-D array
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(matrix[i][j] != 0){
					move = Math.abs(2-i) + Math.abs(2-j);
				}
			}
		}
		System.out.println(move);
		sc.close();
	}

}