package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Paiza066Banel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int loop = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
 		char[][] map = new char[w][h];
		char[][] checkMap = new char[loop][loop];
		for(int i = 0 ;i < w; i++) {
			map[i] = sc.next().toCharArray();
			for(int j =0; j< h ;j ++) {
				
			}
		}
		String text = "";
		for(int i = 0; i < loop * loop ; i++) {
//			for(int j = 0; j < loop; j++) {
				if(i  % 2 == 0) {
					String line = sc.nextLine();
					text += line;
				}else {
					text = "";
				}
//			}
			System.out.println("aaaaaa:" + text);
		}
		
	
//		for(int i = 0 ;i < loop; i++) {
//			for(int j =0; j< loop ;j ++) {
//				System.out.print(checkMap[i][j] + " ");
//			}
//			System.out.println();
//		}
//	
	}
}
