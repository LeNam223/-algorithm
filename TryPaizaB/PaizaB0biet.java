package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
public class PaizaB0biet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int cot = sc.nextInt();
		int loop = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		String[] ouput = line.split(" ");
		String position =ouput[0];
		int number = Integer.parseInt(ouput[1]);
		
		int checkX = hang-1;
		int checky = cot-1;
		
		if(position.equals("U")) {
			for(int i = 0 ; i < number; i++) {
				if(y == checky) {
					y-=checky;
				}else {
					y++;
				}
			}
		} else if(position.equals("L")) {
			for(int i = 0 ; i < number; i++) {
				if(x == 0) {
					x+=checkX;
				}else {
					x--;
				}
			}
		}
		System.out.println(x + " " + y);
		
		
	}
}
