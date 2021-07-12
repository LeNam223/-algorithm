package TryPaizaB;
import java.util.Scanner;
//import java.util
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class paizaB61_福袋 {
//	static void boolean checkNum
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int checkNum = sc.nextInt();
		int inputNum = sc.nextInt();
		int[] save = new int[inputNum];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < inputNum; i++) {
			save[i] = sc.nextInt();
			arr.add(save[i]);
 		}

		for(int i = 0; i < inputNum; i++) {
			for(int j = i+1; j < inputNum; j++ ) {
				ArrayList<Integer> arr1 = new ArrayList<Integer>();
				if(save[i] + save[j] >= checkNum) {
					arr1.add(save[i]);
					arr1.add(save[j]);
					list.add(arr1);

				}				
			}
		}
		for(int i = 0; i < arr.size(); i++) {
			for(int j = i+1 ; j < arr.size(); j++) {
				int total = save[i] + save[j];
				if(total >= checkNum) {
					list.add(arr.subList(i, j+1));
				}
			}
		}
		int sum = 0;
		boolean check = true;
		System.out.println(list);
		for(int i = 0 ; i < list.size(); i++) {
			List<Integer> newarr= list.get(i);
			for(int j = 0; j  < newarr.size(); j++) {
				sum += newarr.get(j);
			}
			for(int z = 0; z < newarr.size(); z++) {
				if(sum - newarr.get(z) > checkNum) {
					check = false;
					break;
				}else {
					check = true;
				}
			}
			
			if(check == true) {
				System.out.println(newarr);
			}
			sum =0;
		}
	}
}
