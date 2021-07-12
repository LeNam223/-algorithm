package TryPaizaB;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class PaizaB015 {
	public static void swap(int i, int j, char ch[]) {
		char tmp = ch[i];
		ch[i] = ch[j];
		ch[j]= tmp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map <Integer, String> map = new HashMap<Integer, String>();
		ArrayList<String> arr  = new ArrayList<String>();
		ArrayList<ArrayList<Character>> checkarr = new ArrayList<ArrayList<Character>>();
		map.put(0, "111110");
		map.put(1, "0110000");
		map.put(2, "1101101");
		map.put(3, "1111001");
		map.put(4, "0110011");
		map.put(5, "1011011");
		map.put(6, "1011111");
		map.put(7,"1110010");
		map.put(8, "1111111");
		map.put(9, "1111011");
		String text = "";
		for(int i = 0 ; i < 2; i++) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			for(int j = 0; j <split.length; j++) {
				text+= split[j];
			}
			arr.add(text);
			text ="";
		}		
		
		String check1 = arr.get(0);
		String check2 = arr.get(1);
		boolean checkValue = false;
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < map.size(); j++) {
				if(arr.get(i).equals(map.get(j)) ) {
					checkValue = true;
					break;
				} else {
					checkValue = false;
				}
			}	
		}
		
		if(checkValue == true) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		for(int i =0; i < arr.size(); i++) {
			char[] ch = arr.get(i).toCharArray();
			ArrayList<Character> newarr = new ArrayList<Character>();
			for(int j = 0; j <ch.length; j++) {
				newarr.add(ch[j]);
			}
			checkarr.add(newarr);
		}
		for(int i = 0; i  < checkarr.size() ;i++) {
			ArrayList<Character> newarr = checkarr.get(i);
			Collections.swap(newarr, 5, 1);
			Collections.swap(newarr, 4, 2);
		}	
		Collections.swap(checkarr, 0, 1);
		text = "";
		ArrayList<String> Arr = new ArrayList<String>();
		for(int i = 0; i  < checkarr.size() ;i++) {
			ArrayList<Character> newarr = checkarr.get(i);
			for(int j = 0; j < newarr.size(); j++) {
				String s=Character.toString(newarr.get(j));
				text+=s;
			}
			Arr.add(text);
			text = "";
		}

		boolean checkV = false;
		for(int i = 0 ; i < Arr.size(); i++) {
			for(int j = 0; j < map.size(); j ++) {
				if(Arr.get(i).equals(map.get(j))){
					checkV = true;
					break;
				}
			}
		}
		if(checkV == false ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		text = "";
		ArrayList<String> NewArr = 	new ArrayList<String>();
		boolean checkV1 = false;
		for(int i = 0; i < arr.size(); i++) {
			char[] ch = arr.get(i).toCharArray();
			swap(2,5,ch);
			swap(1,4,ch);
			swap(0, 3, ch);
			for(int j = 0; j < ch.length; j ++) {
				text+=ch[j];
			}
			NewArr.add(text);
			text = "";

		}
		Collections.swap(NewArr, 0, 1);
		checkV1 = true;
		for(int i = 0 ; i < NewArr.size(); i++) {
			String num = NewArr.get(i);
			for(int j = 0; j < map.size(); j ++) {

				if(num.equals(map.get(j))) {
					checkV1 = false;
					System.out.println("No");
					break;
				}else {
					checkV1 = true;
				}
			}
		}
		if(checkV1) {
			System.out.println("Yes");
		}
 	}
}
