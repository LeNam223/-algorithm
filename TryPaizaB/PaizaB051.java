package TryPaizaB;
import java.util.ArrayList;
import java.util.Scanner;
public class PaizaB051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] sodoku = new int[num][num];
		int total = 0;
		int max = 0;
		String check = "";
		boolean so0 = false;
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num ; j++) {
				sodoku[i][j] = sc.nextInt();
				total += sodoku[i][j];
				arr.add(sodoku[i][j]);
			}
			 if(total > max) {
				 max = total;
			 }
			total = 0;
		}
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		int getNum = 0;
		int checkNum = 0;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num ; j++) {
				if(j < num -1 ) {
					if(sodoku[i][j] == 0) {
						so0 = true;
						if(sodoku[i][j+1] == 0) {
							check = "doc";
						} else {
							check = "ngang";
						}
					}
				}	
			}
		}
		int vitriArr = 0;
		int result = 0;
		if(check.equals("ngang")) {
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num ; j++) {
					count++;
					checkNum += sodoku[i][j];
					
					if(sodoku[i][j] == 0)  {
						so0 = true;
						vitriArr = count;
					}
				}
				
				if(so0 == true) {
					result = max - checkNum;
					arr1.add(result);
				}
				checkNum = 0;
				so0 = false;
				vitriArr = 0;
			}
		} 
		else {
			so0 = false;
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					count++;
					checkNum += sodoku[j][i];
					if(sodoku[j][i] == 0)  {
						so0 = true;
						vitriArr = count;
					}
				}
				
				if(so0 == true) {
					result = max - checkNum;
					arr1.add(result);
				}
				vitriArr = 0;
				checkNum= 0;
				so0 = false;
			}
			
		}
		int xuongDong = num -1 ;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == 0) {
				arr.set(i, arr1.get(getNum));
				getNum++;
			}
			System.out.print(arr.get(i) + " ");
			if(i == xuongDong) {
				System.out.println();
				xuongDong += num;
			}
		
		}
		
	}
}
