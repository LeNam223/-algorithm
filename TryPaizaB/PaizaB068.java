package TryPaizaB;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PaizaB068 {
	public static void main(String[] args) {
//		int[] element = {6 ,18 ,24 ,34};
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int cot = sc.nextInt();
		String[][] save = new String[hang][cot];
		int sum = 0;
		sc.nextLine();
		for(int i = 0; i < hang; i++){
			for(int j = 0; j < cot; j++) {
				save[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("sum : " + sum);
		String line = "";
		if(sum % 2 ==0 ) {
			int chiadoi = sum / 2;
			int checksum = 0;
			System.out.println("chia doi : " + chiadoi);
			for(int i  = 0; i < element.length; i++) {
				checksum +=element[i];
				
				if(checksum <= chiadoi ) {
					System.out.println("yes");
					System.out.println(checksum);
					
					line += "A";
				} else i{
					System.out.println("No");
					line += "B";
				}else{
					System.out.println("No");
				}	
		}
	
		System.out.println(line);
		
		char test = 'A';
		test += 1;
		System.out.print(test);		
		boolean check = true;
		System.out.println(check);
	
	
	}	
}
