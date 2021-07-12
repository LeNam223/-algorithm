package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PaiZ {
	public static int next(int nowPosition, ArrayList<Integer> arr) {
		int nextPosiotn  = nowPosition + 1;
		while(arr.get(nextPosiotn) == 0) {
				nextPosiotn+=1;
		}
		return nextPosiotn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] task = new String[num];
		sc.nextLine();
		int StartDay, endDay,requirDate;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		boolean checkEnd = false;
		for(int i = 0; i < num; i++) {
			task[i] = sc.nextLine();
			String[] split = task[i].split(" ");
			StartDay = Integer.parseInt(split[1]);
			endDay = Integer.parseInt(split[2]);
			requirDate = Integer.parseInt(split[0]);
			arr.add(StartDay);
			arr.add(endDay);
		}
		Collections.sort(arr);
		int min = arr.get(0);
		int max = arr.get(arr.size() -1);
		for(int i  = min; i <= max; i++) {
			newarr.add(i);
		}
		System.out.println(newarr);
		int index = 0;
		for(int i = 0; i < num; i++) {
			String[] split = task[i].split(" ");
			StartDay = Integer.parseInt(split[1]) -1;
			endDay = Integer.parseInt(split[2]);
			requirDate = Integer.parseInt(split[0]);
			
			for(int j = StartDay; j < StartDay + requirDate; j++) {
				index = next(j-1, newarr);
				newarr.set(index, 0);
				
			}
			System.out.println(newarr);
			if(index+1 <= endDay) {checkEnd = true;}
			else {checkEnd = false; System.out.println("NO"); break;}
		}
		if(checkEnd == true) {System.out.println("YES");}
		
	}
}