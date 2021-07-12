package TryPaizaB;
import java.util.Scanner;

public class Paiza024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		int cast = (int)(r + 1);
		int result = 0;
		for(int i = 0; i < cast; i++) {
		  result += (int)Math.ceil(Math.sqrt(r * r - i*i)); 
		}
		result *=4;
		System.out.println(result);
		 
	}
}
