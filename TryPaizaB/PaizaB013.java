package TryPaizaB;
import java.util.Scanner;

public class PaizaB013 {
	static int add0(int check) {
		if(check < 10) {
			
		}
		return 0;
	}
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] times = line.split(" ");
		int timeWalk = Integer.parseInt(times[0]);
		int timeTrain = Integer.parseInt(times[1]);
		int timeGoCom = Integer.parseInt(times[2]);
		int number = sc.nextInt();
		String[] count = new String[number];
		sc.nextLine();
		
		for(int i = 0; i < number; i++) {
			count[i] = sc.nextLine();
		}
		
		int defaultHour = 8;
		int defaultMinutes = 59;
		int sumTimes = timeWalk + timeTrain;
		int changedSumHour = sumTimes / 60;
		int changedSumMinutes = sumTimes % 60;
		defaultHour -= changedSumHour;
		defaultMinutes -= changedSumMinutes;
		int trainHour = 0;
		int trainMinutes =0;
		if(defaultMinutes < 0) {
			changedSumMinutes-=60;
			changedSumHour += 1;
		}
		
		for(int i = 0; i < count.length; i++) {
			String output = count[i];
			String[] countTime = output.split(" ");
			int checkHour = Integer.parseInt(times[0]);
			int checkMinutes = Integer.parseInt(times[1]);
			
			
			if(checkHour <= changedSumHour && checkMinutes <= changedSumMinutes) {
				trainHour = checkHour - ;
				trainMinutes = checkMinutes;
			}
			System.out.println("Train hour " + trainHour);
			System.out.println("Train Minutes " + trainMinutes);
			trainHour -= timeWalk;
			
			if(defaultMinutes < 0) {
				defaultMinutes -=60;
				defaultHour +=1;
			}
		}
		System.out.println(add0(trainHour) + ":" + add0());
	}
}