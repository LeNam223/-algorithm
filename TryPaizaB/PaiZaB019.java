package TryPaizaB;
import java.util.Scanner;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class PaiZaB019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		int[][] output = new int[num][num];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> newArr = new ArrayList<Integer>();		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <  num; j++) {
				output[i][j] = sc.nextInt();
				arr.add(output[i][j]);
			}
		}
		int total = 0;
		int chia = 1;
		for(int i  = 1 ; i <= arr.size(); i++) {
			total += arr.get(i - 1);
			if(i > 0 && i / k == chia) {
				chia++;
				newArr.add(total);
				total = 0;
			}
		}
		for(int i = 0 ; i < newArr.size(); i +=num) {
			list.add(newArr.subList(i, i+ 6));
		}
		int sum = 0;
		int count = 0;
		int test = 0;
		for(int i = 0 ; i < list.size(); i++) {
			List<Integer> temp = list.get(i);
			for (int j = 0; j < (num/k); j++) {
				test = j;
				count = 0;
				sum = 0;
				while(count < k) {
					sum += temp.get(test);
					test += (num / k);
					count++;
				}
				sum /= (k * k); 
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}

