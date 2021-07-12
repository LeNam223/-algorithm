package TryPaizaB;
import java.util.Scanner;
import java.util.Arrays;
enum Direction1 {
	LeftToRight, RightToLeft, UpToDown, DownToUp;
}
public class PaizaB088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String[]save = new String[num1];
		sc.nextLine();
		
		for(int i = 0; i < num1; i++){
			save[i] = sc.nextLine();
		}
		
		char[][] robot = new char[num1][num2];
		
		for(int i = 0; i < num1; i++) {
			String changChar = save[i];
			char[] changedChar = changChar.toCharArray();
			for(int j = 0; j < num2; j++) {
				robot[i][j] = changedChar[j];
			}
		}
//		 toa mot long gioi han robot khong vuot ra ngoai vung kiem soat
		
		char[][] bien = new char[num1 + 2][num2 + 2];
		String direction1 = "phai";
		for(int i = 1; i < num1+1; i++) {
			for(int j = 1; j < num2+1; j++) {
				bien[i][j] = robot[i-1][j-1];
			}
		}
		
		for(int i = 0; i <  num1 +2; i++) {
			bien[i][0] = '#';
			bien[i][num2+1] = '#';	
		}
			
		for(int j = 0; j < num2+2; j++) {
			bien[0][j] = '#';
			bien[num1+1][j] = '#';
		}
		int goc = 90;
		int movedX = 1;
		int movedY = 1;
//		Direction1 direction = Direction1.LeftToRight;
		while(true) {
			char right = bien[movedX][movedY + 1];
			char down = bien[movedX + 1][movedY];
			char left = bien[movedX][movedY - 1];
			char up = bien[movedX -1][movedY];
			
//			if(bien[movedX][movedY] == '.') {
//					bien[movedX][movedY] = '#';
//			}	
//			****try cach 1*****
//			switch(direction) {
//				case LeftToRight: 
//					if(bien[movedX][movedY + 1] == '#') {
//						direction = Direction1.UpToDown;
//						System.out.println("direction" + " " + direction);
//						System.out.println(movedX + " " + movedY);
//						break;
//					}else {
//						movedY++;
//					}
//					break;
//				 
//				case UpToDown: 
//					if(bien[movedX + 1][movedY] == '#') {
//						direction = Direction1.RightToLeft;
//					}else {
//						movedX++;
//					}
//					break;
//				
//				case RightToLeft: 
//					if(bien[movedX][movedY - 1] == '#') {
//						direction = Direction1.DownToUp;
//						
//					}else {
//						movedY--;
//					}
//					break;
//				
//				case DownToUp: 
//					if(bien[movedX - 1][movedY] == '#') {
//						direction = Direction1.LeftToRight;
//					} else {
//						movedX--;
//					}
//				
//					break;
//				
//			}
//			if(bien[movedX][movedY + 1] == '#' && bien[movedX + 1][movedY] == '#' && bien[movedX + 1][movedY] == '#' && bien[movedX - 1][movedY] == '#') {
//				System.out.print((movedY -1) + " " + (movedX -1));
//				break;
//			}
//			***try cach 2 ***
			
//			if(direction.equals("phai") ) {
//				if(right == '#') {
//					direction = "xuong";
//				}else {
//					movedY++;
//				}
//			} if(direction.equals("xuong")) {
//				if(down == '#') {
//					direction = "trai";
//				}else {
//					movedX++;
//				}
//			}if(direction.equals("trai")) {
//				if(left == '#') {
//					direction = "len";
//				}else {
//					movedY--;
//				}
//			}if(direction.equals("len")) {
//				if(up == '#') {
//					direction = "phai";
//				}else {	
//					movedX--;
//				}
//			}if(right == '#' && left == '#' && up == '#' && down == '#') { 
//				System.out.println((movedX -1) + " " + (movedY -1));
//				break;
//			}
			
//		  *** try voi cach 3 ***
			// robot di qua . thi diem do bien thanh #
			if(bien[movedX][movedY] == '.') { 
				bien[movedX][movedY]= '#';
			}
			
				// cac huong di cua robot, neu gap # thi re phai(+90 do)
			if(goc == 0) {
				if(bien[movedX-1][movedY] == '#') {
						goc += 90;
				} else {
					movedX--;
				}
			} if(goc == 90) {
				if(bien[movedX][movedY+1] == '#') {
					goc += 90;
				} else {
					movedY++;
					}
			  } if(goc == 180) {
				  if(bien[movedX+1][movedY] == '#') {
					 goc += 90;
				  } else {
					  movedX++;
				  }
				} if(goc == 270){
					if(bien[movedX][movedY-1] == '#') {
						goc += 90;
					} else {
						movedY--;
					}
				}
					if(goc >= 360) {
						goc -= 360;
				}
				// neu xung quanh 4 huong deu la # thi finish
				if(bien[movedX-1][movedY] == '#' && bien[movedX][movedY -1] == '#'
				&& bien[movedX+1][movedY] == '#' && bien[movedX][movedY+1] == '#') {
					System.out.println((movedY-1) + " " + (movedX-1));
					break;
				}
			}

		sc.close();
	}
}
