package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
public class PaizaB026 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ouput = input.split(" ");
		String line1 = ouput[0];
		String line2 = ouput[1];
		char checkPrev = '0';
		char checkNext = '0';
		char[] ch1 = line1.toCharArray();
		char[] ch2 = line2.toCharArray();
		char phaiTruTraiTru, phaiCongTraiTru, traiCongPhaiTru, phaiCongTraiCong;
		phaiTruTraiTru = ch2[0];
		phaiCongTraiTru = ch2[1];
		traiCongPhaiTru = ch2[2];
		phaiCongTraiCong = ch2[3];
		boolean check = false;
		ArrayList<Character> arr = new ArrayList<Character>();
		ArrayList<Character> checkarr = new ArrayList<Character>();
		ArrayList<Character> result = new ArrayList<Character>();
		for(int i = 0; i < ch1.length; i++ ) { 
			checkarr.add(ch1[i]);
		}
		result.addAll(checkarr);
		int solanlap = 6;
		while(solanlap > 0) {
			solanlap--;
			for(int i = 0; i < result.size(); i++ ) {
				if(i == 0) {
					checkPrev = result.get(9);
					checkNext =  result.get(i + 1);
					if(checkPrev == '-' && checkNext == '-') {
						arr.add(phaiTruTraiTru);
					}else if(checkPrev == '-' && checkNext == '+' ) {
						arr.add(phaiCongTraiTru);
					} else if(checkPrev == '+' && checkNext == '+' ) {
						arr.add(phaiCongTraiCong);
					} else {
						arr.add(traiCongPhaiTru);
					}
				} else if(i == 9) {
					checkPrev = result.get(8);
					checkNext =  result.get(0);
					if(checkPrev == '-' && checkNext == '-') {
						arr.add(phaiTruTraiTru);
					}else if(checkPrev == '-' && checkNext == '+' ) {
						arr.add(phaiCongTraiTru);
					} else if(checkPrev == '+' && checkNext == '+' ) {
						arr.add(phaiCongTraiCong);
					} else {
						arr.add(traiCongPhaiTru);
					}
				}else {
					checkPrev = result.get(i - 1);
					checkNext = result.get(i + 1);
					if(checkPrev == '-' && checkNext == '-') {
						arr.add(phaiTruTraiTru);
					}else if(checkPrev == '-' && checkNext == '+' ) {
						arr.add(phaiCongTraiTru);
					} else if(checkPrev == '+' && checkNext == '+' ) {
						arr.add(phaiCongTraiCong);
					} else {
						arr.add(traiCongPhaiTru);
					}
				}
				
			}
			result.removeAll(result);
			result.addAll(arr);
			if(result.equals(checkarr)) {
				check = true;
			}
		}
		if(check == false) {
			System.out.print("NO");
		}else {
			System.out.print("YES");
		}
	}
}
