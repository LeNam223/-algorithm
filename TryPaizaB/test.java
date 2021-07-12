package TryPaizaB;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.regex.MatchResult;
//import java.util.Scanner;
//public class test {
//
//    private static Scanner s;
//
//    public static void main(String[] args) {
//    	s = new Scanner(System.in);
//        check(1);
//    }
//
//    public static void check(int count) {
//        if(s.hasNext()) {
//            String ns = s.nextLine();
//            System.out.println(count + " " + ns);
//            check(count + 1);
//        }
//    }
//} 
//
//public class test {
//    public static void main(String[] args) {
//        Scanner sc;
//        String s = "I love you so much. I want to marry you";
//        sc = new Scanner(s);
//        while (sc.hasNext()) {
//            String token = sc.next();
//            System.out.println(token);
//        }
//    }
//}  
    	
//    	 String input = "1 fish 2 fish red fish blue fish";
//         Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//         Scanner s = new Scanner(input).useDelimiter(" ");
//         System.out.print(s);
//         System.out.println(s.next());
//         System.out.println(s..next());
//         System.out.println(s.next());
//         System.out.println(s.next());
//         System.out.println(s.next());
//         System.out.println(s.next());
//         System.out.println(s.next());

//         s.close();

//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input);
//        s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
//        MatchResult result = s.match();
//        for (int i=1; i<=result.groupCount(); i++)
//            System.out.println(result.group(i));
//        s.close();
  

//public class Main {
//    public static void main(String args[] ) throws Exception {
//       Scanner sc = new Scanner(System.in);
//       int A = sc.nextInt();
//       int B = sc.nextInt();
//        int total = 0;
//       for(int i = A; i <= B; i++) {
//           total+= (i - A) + (i- B);
//           
//       }
//       System.out.println(total);
//    }
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class ToaDo {
	int x;
	int y;

	void ToaDo(int x, int y) {
		this.x = x;
		this.y = y;
		}
	}

	class Source extends ToaDo {
		int light;
		ToaDo toado;
		void Source (ToaDo toado, int light ) {
			this.toado = toado;
			this.light = light;
		}

	}

	public class test {
		public static boolean checkExeption(int x, int y, int w, int h) {

			if(x >= 0 && x < w && y >=0 && y <h) {
				return true;
			}
			return false;
		}

		public static int[][] move(Source source,int w ,int h) {
			int[][] khoitao =new  int[w][h];
			for(int i = 0; i < w; i++) {
				for(int j =0 ; j < h; j++) {
					khoitao[i][j] = 0;
				}
			}

			boolean[][] visited = new boolean[w][h];
			for(int i = 0; i < w; i++) {
				for(int j =0 ; j < h; j++) {
					visited[i][j] = false;
				}
			}

			visited[source.toado.y][source.toado.x] = true;

			int[] xmove = {-1,0,0,1};
			int[] ymove = {0,-1,1,0};

			   Queue<Source> q = new LinkedList<Source>();
			   q.add(source);

			   while(q.size() != 0) {
				     Source current = q.poll();

	          for(int i = 0; i < 4; i++) {
	            int X = xmove[i] = current.
	            
	          }

			   }

			   return null;
		}
		public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
			int w = sc.nextInt();
			int h = sc.nextInt();

			int[][] input = new int[w][h];
			ArrayList<ArrayList> a = new ArrayList<>();
				for(int i = 0; i < w; i++) {
					ArrayList tmp = new ArrayList<>();
					for(int j =0 ; j < h; j++) {
						tmp.add(sc.nextInt());
					}
					a.add(tmp);
			}
	    
		}
		
	}

