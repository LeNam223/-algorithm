package TryPaizaB;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class paizaB04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] splt  = input.split(" ");
	
		int numChange = Integer.parseInt(splt[0]);
		String line = splt[1];
		char[] stringLine = line.toCharArray();
		
 		Map<String, String > map = new HashMap<String, String>();
		String checkInput = sc.nextLine();
			
		for(int i = 0; i < stringLine.length; i++) {
			char c = stringLine[i];
			String key = String.valueOf(c); 
			char value = (char) ('a' + i);
			map.put(key, "" + value);
		}
		
		int loop = 0;
		int result =0;
		String resultT = checkInput;
		while (loop < numChange) {
			resultT = result(resultT, map);
			loop++;
		}
		System.out.println(resultT);
	}
}
