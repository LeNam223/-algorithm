package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
class Point {
	int toadoX;
	int toadoY;
	
	public Point(int x, int y) {
		toadoX = x;
		toadoY = y;
	}
	public String toString() {
        return toadoX + " " + toadoY;
    }
}


public class paizaB081 {

	public static int result(Point A, ArrayList<Point> arr) {
		int checkX = A.toadoX;
		int checkY = A.toadoY;
		int tiepxuc = 0;
		for(Point check : arr) {
			// tiep xuc trai
			if(checkX == check.toadoX && checkY ==  (check.toadoY + 1)) {
				tiepxuc += 1;
			} else if(checkX == (check.toadoX) && checkY ==  (check.toadoY - 1))  { // tiep xuc phai
				tiepxuc += 1;
			} else if(checkX == (check.toadoX - 1) && checkY ==  check.toadoY)   { // tiep xuc tren
				tiepxuc += 1;
			} else if( checkX == (check.toadoX + 1) && checkY == check.toadoY) { // tiep xuc duoi
				tiepxuc += 1;
			}
		}
		int count = 4 - tiepxuc;
		return count; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int cot = sc.nextInt();
		String[] line = new String[hang];
		sc.nextLine();
		ArrayList<Point> firstArr = new ArrayList<Point> ();
 		for(int i = 0; i < hang; i++) {
 			line[i] = sc.nextLine();
 		}
 		for(int i = 0; i < hang; i++) {
 			char[] tach = line[i].toCharArray();
 			for(int j = 0; j < tach.length; j++) {
 				char check = tach[j];
 				String ouput = String.valueOf(check);
 			
 				if(ouput.equals("#")) {
 					firstArr.add(new Point(i, j));
 				}
 			}
 		}
 		int count = 0;
 		for (Point toado : firstArr) {
 			ArrayList<Point> copyArr = (ArrayList<Point>) firstArr.clone();
 			copyArr.remove(toado);
 			count += result(toado, copyArr);

 		}
 		System.out.println(count);
 		
 		
	}
}
