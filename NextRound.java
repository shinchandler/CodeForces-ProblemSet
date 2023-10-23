import java.util.*;

public class NextRound{
	public static void main(String[] args){
		int count =0;
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int position = sc.nextInt();
		sc.nextLine();

		int score[] = new int[participants];
		for(int i = 0; i < participants; i++){
			score[i] = sc.nextInt();
		}

		for(int i = 0; i < participants; i++){
			if(score[i] >= score[position-1] && score[i] != 0 ){
			count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}