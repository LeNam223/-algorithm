package TryPaizaB;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Paiza79 {
	public static ArrayList<Integer> test(ArrayList<Integer> arr) {
		ArrayList <Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < arr.size() - 1; i++) {
			int total = arr.get(i) + arr.get(i + 1);
			if(total >= 101) {
				total -= 101;
			}
			temp.add(total);
		}

		return temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList <Integer> arr = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		map.put("g", 7);
		map.put("h", 8);
		map.put("i", 9);
		map.put("j", 10);
		map.put("k", 11);
		map.put("l", 12);
		map.put("m", 13);
		map.put("n", 14);
		map.put("o", 15);
		map.put("p", 16);
		map.put("q", 17);
		map.put("r", 18);
		map.put("s", 19);
		map.put("s", 20);
		map.put("t", 21);
		map.put("u",22);
		map.put("v",23);
		map.put("w", 24);
		map.put("y", 25);
		map.put("z", 26);
		int total = 0;
		int num;
		char[] change = input.toCharArray();
		String key;
		for(int i = 0; i < change.length; i++) {
			if(change[i] == ' ') {
				continue;
			}
			
			key = String.valueOf(change[i]);
			num = map.get(key);
			arr.add(num);
		}

		while(arr.size() > 1) {
			ArrayList temp = Paiza79.test(arr);
			arr = temp; 
		}
		total = arr.get(0);

		String[] tach = input.split(" ");
		String dao = tach[1] + tach[0];
//	
		int total1 = 0;
		char[] change1 = dao.toCharArray();
		for(int i = 0; i < change1.length; i++) {
			if(change1[i] == ' ') {
				continue;
			}

			key = String.valueOf(change1[i]);
			num = map.get(key);
			arr.add(num);
		}
		
		while(arr.size() > 1) {
			ArrayList temp1 = Paiza79.test(arr);
			arr = temp1;
		}
		total1 = arr.get(0);
	
		if(total > total1) {
			System.out.println(total);
		}else {
			System.out.println(total1);
		}
	}
}
