package TryPaizaB;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int average = (a + b + c)/ 3;
//		int soDu =((a + b + c) % 3);
//		int A =   average + soDu;
//		int B = average;
//		int C = average;
//		System.out.println("Số tiền A phải trả:" + A);
//		System.out.println("Số tiền B phải trả:" + B);
//		System.out.println("Số tiền C phải trả:" + C);
//		int x = 0;
//		// nếu số tiền a mà thấp số tiền A thì 
//		if (a < A ) {
//			//nếi mà A
//			 if (b > A ) {
//				 x = (A - a);
//			 }else if (b < average ) {
//				 x = 0;
//			 } else {
//				 x = 0;
//			 }
//				 System.out.println(x);
//		}else if (a  >  A) {
//			  if (b < A ) {
//				  x = B - b;
//			  } else if ( b > A) {
//				  x = 0;
//			  } else {
//				  x = 0;
//			  } 
//			 if ( x == 0) {
//				 System.out.println(x);
//			 } else {
//				 System.out.println("-" + x);
//			 }
//		} else {
//			System.out.println(x);
//		}
//		int y = 0;
//		if( b < average) {
//			if(c > average) {
//				y = (B - b);
//			} else if (c <  average) {
//				y = 0;
//			} else {
//				y = 0;
//			}
//			if ( y == 0) {
//				 System.out.println(y);
//			 } else {
//				 System.out.println(y);
//			 }
//		} else if (b > average) {
//			if(c < average) {
//				y = B - c;
//			} else if (c >  average) {
//				y = 0;
//			} else {
//				y = 0;
//			}
//			 if ( y == 0) {
//				 System.out.println(y);
//			 } else {
//				 System.out.println("-" + y);
//			 }
//		} else {
//			 System.out.println(y);
//		}
//		int z = 0;
//		if(c < average) {
//			if(a > average) {
//				z = (C - c);
//			} else if (a <  average) {
//				z = 0;
//			} else {
//				z = 0;
//			}
//			 if ( z == 0) {
//				 System.out.println(z);
//			 } else {
//				 System.out.println(z);
//			 }
//		} else if (c > average) {
//			if(a < average) {
//				z = A - a;
//			} else if (a >  average) {
//				z = 0;
//			} else {
//				z = 0;
//			}
//			 if ( z == 0) {
//				 System.out.println(z);
//			 } else {
//				 System.out.println("-" + z);
//			 }
//		} else {
//			System.out.println(z);
//		}
		String input = "123";
		String result = "";
		char[] ch = input.toCharArray();
		for(int i = ch.length-1; i >=0 ; i--) {
			result += ch[i];
		}
		System.out.println(result);
	}
}
