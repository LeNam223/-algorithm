package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PiazaNoName {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		List<Integer> newarr =  new ArrayList<Integer>();
		List<List<Integer>> list =  new ArrayList<List<Integer>>();
		for(int i = 1; i <= n * 2; i++) {	
			arr.add(i);
		}
		newarr.addAll(arr);
		Collections.reverse(newarr);
		System.out.println(arr);
		System.out.println(newarr);
		for(int i = 0 ; i < m ; i++) {
			if(arr.get(i) == m) {
				System.out.println(newarr.get(i));
			}
		}
		
 	}
}
