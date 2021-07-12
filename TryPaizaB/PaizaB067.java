package TryPaizaB;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class PaizaB067 {
	public static void main(String [] args)  {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int[][] save  =  new int[num][3];
		Map<Integer, String > map = new HashMap<Integer, String>();
		int ngayCanThiet;
		int ngayBatDau;
		int ngayKetThuc;
		int ngayConLai;
		int uuTien;
		int count = 0;
		 System.out.println(false);
		for(int i = 0; i < num; i++) {
			String line = sc.nextLine();
			String[] spl = line.split(" ");
			ngayCanThiet = Integer.parseInt(spl[0]);
			ngayBatDau = Integer.parseInt(spl[1]);
			ngayKetThuc = Integer.parseInt(spl[2]);
			
			map.put(line, Line);
		}
		
		for(int i = 0; i < num; i++) {
//			for(int j = 0; j < 3; j++) {
//				ngayCanThiet = save[i][0];
//				ngayBatDau = save[i][1];
//				ngayKetThuc = save[i][2];
//				
				//task 1
//				count = ngayBatDau + ngayCanThiet;
			}		
		}
		
	}
}
