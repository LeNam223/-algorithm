package TechFul;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Collections;
//import TryPaizaB.PaizaB025;
public class techful_リレー走 {
	public static int next(int nowPosition, ArrayList<Integer> arr ) {
		int nextPosiotn  = nowPosition + 1;
		int len = arr.size();
		if(nextPosiotn >= len) {
			nextPosiotn -= len;
		}
		while(arr.get(nextPosiotn) == 0) {
				nextPosiotn+=1;
				if(nextPosiotn >= len) {
					nextPosiotn-= len;
		}
		}
		return nextPosiotn-1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int peoNum = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(); 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		String[] line = new String[peoNum];
		sc.nextLine();
		
		for(int i = 1; i <=n ; i++) {
			arr.add(0);
		}
		for(int i = 0 ; i < peoNum; i++) {
			line[i] = sc.nextLine();
			String[] split = line[i].split(" ");
			int value = Integer.parseInt(split[0]);
			int key = Integer.parseInt(split[1]);
			map.put(key , value);
		}
		
//		System.out.println(arr);.arg
//		System.out.println(map);
		
		 for (int i : map.keySet()) {
//		      System.out.println("key: " + i + " value: " + map.get(i));
		      for(int j =0 ; j < arr.size(); j++) {
		    	  if(map.get(i) - 1 == j) {
		    		arr.set(j, i);
		    	  }
		      }
		  }
		 int check = 0;
		//  System.out.println(arr);
		 for(int i = 1; i <= peoNum; i++) {
				int now = arr.indexOf(i);
				int next = next(now, arr);
				// System.out.println("next :" + next);
				if(next == -1) {
					next = 0;
				}
				arr.set(next , i);
				arr.set(now, 0);
				newarr.add(next);
				
				// System.out.println(arr);
//				System.out.println("next :" + next);
			}
		 Collections.sort(newarr);
		 int count = 0;
		 int count2 = 0;
		 for(int i = 0; i < newarr.size() -1; i++){
			if(newarr.get(i) + 1 == newarr.get(i  +1)) {
				count2 = 1;
			}else {
				count ++;
			}
		}	
		 System.out.println(count2 + count);

	}
}

