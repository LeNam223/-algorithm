package TryPaizaB;

import java.util.Scanner;
class cell {
	int x;
	int y;
	
}
public class paizaB091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] save = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				save[i][j] = sc.nextInt();
			}
		}
		
		int[][] tuong  = new int[num+2][num+2];
		for(int i = 1; i < num+1; i++) {
			for(int j = 1; j < num+1; j++) {
				tuong[i][j] = save[i-1][j-1];
			}	
		}
		
		for(int i = 0; i < num+2; i++) {
			tuong[i][0] = 0;
			tuong[i][num+1] = 0;
			}
		
		for(int j = 0; j < num+2; j++) {
			tuong[0][j] = 0;
			tuong[num+1][j] = 0;
		}
		
		int check = 0;
		int checkUp, checkDown, checkLeft, checkRight;
		int x  = 1;
		int y  = 1;

		int len = save.length + 1 ;
		System.out.println(len);
		int i = 0;
		while(true) {
			i++;
			check = tuong[x][y];
			checkUp = tuong[x - 1][y];
			checkDown = tuong[x +1][y];
			checkLeft = tuong[x][y-1];
			checkRight = tuong[x][ y+1];

			if(checkUp < check && checkDown < check && checkLeft < check && checkRight < check) {
				System.out.println(check);
			}
			if (i >= len) {
				break;
			}
			x++;
			y++;
		}
	}
}
