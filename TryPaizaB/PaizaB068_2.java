package TryPaizaB;
import java.util.Scanner;
import java.util.Arrays;
public class PaizaB068_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int cot = sc.nextInt();
		int[][] save = new int[hang][cot];
		int[] sum = new int[hang];
		int[] chiadoi = new int[hang];
		int chiaDoi = 0;
		int count = 0;	
		boolean yesorno = false;
		for(int i = 0; i < hang; i++) {
			for(int j = 0; j < cot ; j++) {
				save[i][j] = sc.nextInt();
				count += save[i][j];
			}
			sum[i] = count;
			count = 0;
			chiaDoi = sum[i] /  2;
			chiadoi[i] = chiaDoi;
			chiaDoi = 0;
		}
//		System.out.println(Arrays.toString(sum));
//		System.out.println(Arrays.toString(chiadoi));
		int checkSum1 = 0;
		int checkSum2 = 0;
		int count1 = 0;

		for(int i = 0 ; i < hang; i++) {
			for(int j = 0; j < cot; j++) {
				checkSum1 += save[i][j];
				if(checkSum1 == chiadoi[i]) {
					 count1++;
				}
			}
				checkSum1 = 0;
		}
		String line = "";
		int count3 = 0;
//		System.out.println(count1);
		if(count1 == hang) {
			System.out.println("Yes");
			for(int i = 0 ; i < hang; i++) {
				for(int j = 0; j < cot; j++) {
					count3 += save[i][j];

					if(count3 > chiadoi[i]) {
						line += "B";

					}else {
						line += "A";
					}
					
				}
				System.out.println(line);
				count3 = 0;
				line = "";
			}
				
		}else {
			System.out.print("No");
			
		}
			
	}
}
