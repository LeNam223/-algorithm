package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class PaizaB025 {
	public static int next(int nowPosition, ArrayList<Integer> arr) {
		int nextPosiotn  = nowPosition + 1;
		int len = arr.size();
		if(nextPosiotn >= len) {
			nextPosiotn -= len;
		}
		while(arr.get(nextPosiotn) != 0) {
				nextPosiotn+=1;
				if(nextPosiotn >= len) {
					nextPosiotn-= len;
		}
		}
		return nextPosiotn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int soChuong = sc.nextInt();
		int soTho = sc.nextInt();
		int soVongLoop = sc.nextInt();
		int[] viTri = new int[soTho];
		for(int i = 0; i < soTho; i++) {
			viTri[i] = sc.nextInt();
		}
		for(int i = 0; i < soChuong; i++)  {
			arr.add(0);
		}
		int checkViTri = 0;
		for(int i = 0; i < soTho; i++) {
			checkViTri  = viTri[i];
			for(int j = 0; j < arr.size(); j++) {
				if(checkViTri == j + 1) {
				arr.set(j, i + 1);
				}
			}	
		}	
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) != 0) {
				result.add(arr.get(i));
			}
		}
		int check = 0;
		for(int i = 0 ; i < soVongLoop; i++) {
			for(int j = 0; j < result.size(); j++) {
				check = PaizaB025.next(arr.indexOf(result.get(j)), arr);
				int start = arr.indexOf(result.get(j));
				arr.set(check, result.get(j));
				arr.set(start, 0);

			}
		}
		for(int i = 0; i <soTho; i++) {
			System.out.println(arr.indexOf(i + 1) + 1);
		}
	}
}
