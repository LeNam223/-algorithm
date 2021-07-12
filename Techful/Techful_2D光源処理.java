package TechFul;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class cells {
  int x;
  int y;
 
  void cells(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
 
class Source extends cells {
  int light;
  cells toado;
  void Source (cells toado, int light ) {
    this.toado = toado;
    this.light = light;
  }
}
 
public class Techful_2D光源処理 {
	public static boolean checkExeption(int x, int y, int w, int h) {
		    if(x >= 0 && x < w && y >=0 && y <h) {
		      return true;
		    }
		    return false;
	}
	  
	public static int[][] move(Source source,int w ,int h) {
		    int[][] khoitao =new int[w][h];
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
		    	   int X = xmove[i] + current;
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
