package TryPaizaB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class Task {
	int priority;
	int remain;
	int start;
	int end;

	public  Task(int priority, int remain, int start, int end) {
		this.priority = priority;
		this.remain = remain;
		this.start = start;
		this.end = end;
	}
	
	public boolean Do(int current) {
		return this.start <= current && current <= this.end;
	}
	
	public void show_List() {
		System.out.println(priority + " "  + remain + " " + start + " " + end);
	}
	
	public boolean result() {
		return this.remain ==0;
	}
}

public class PaizaB067_Object {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] line = new int[num][4];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 4; j++) {
				if(j > 0) {
					line[i][j] = sc.nextInt();
				}else {
					line[i][j] = i + 1;
				}
			}
		}
		
		ArrayList<Task> task = new ArrayList<Task>();
		for(int i = 0; i< num; i++ ) {
			Task temp = new Task(line[i][0],line[i][1],line[i][2],line[i][3]);
			task.add(temp);
		}
		
		Task test_task = new Task(1000, 1000, 0, 1000);
		Task current = test_task;
		for(int time = 0; time < 1000; time++) {
			for(Task tasks: task) {
				if(tasks.Do(time) && tasks.priority < current.priority)  {
					current = tasks;
				}
			}
			if(current.Do(time)) {
				current.remain--;
				if(current.result()) {
					task.remove(current);
					current = test_task;
					
					if(task.size()== 0) {
						break;
					}
				}
			}
		}
		
		if(task.size() != 0) {
			System.out.println("N0");
		} else {
			System.out.println("YES");
		}
		
	}
}
