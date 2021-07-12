package TryPaizaB;
import java.util.Scanner;
enum Direction {
	UP, DOWN, RIGHT, LEFT;
}
public class PaizaB034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startX = sc.nextInt();
		int startY = sc.nextInt();
		int movingRangeT = sc.nextInt();
		int movingRangeRight = sc.nextInt();
		int movingRangeB = sc.nextInt();
		int movingRangeLeft = sc.nextInt();
		int moveNum = sc.nextInt();
		String[] checKDirection = new String[moveNum];
		sc.nextLine();
		Direction direction = Direction.UP;
		String direction1  ="Up";
		for(int i = 0; i < moveNum; i++) {
			checKDirection[i]  = sc.nextLine();
		}
		
		for(int i = 0; i < checKDirection.length; i++) {
			String[] check = checKDirection[i].split(" ");
			String onlyDirection = check[0];
			String direction2 = check[1];
			
			if (onlyDirection.equals("t")) {
				switch (direction) {
				case UP:
					if(direction2.equals("R")) {
						direction = Direction.RIGHT;
					} else if(direction2.equals("L")) {
						direction = Direction.LEFT;
					} else if(direction2.equals("B")) {
						direction = Direction.DOWN;
					}
					break;
				case DOWN:
					if(direction2.equals("R")) {
						direction = Direction.LEFT;
					} else if(direction2.equals("L")) {
						direction = Direction.RIGHT;
					} else if(direction2.equals("B")) {
						direction = Direction.UP;
					}
					break;
				case RIGHT:
					if(direction2.equals("R")) {
						direction = Direction.DOWN;
					} else if(direction2.equals("L")) {
						direction = Direction.UP;
					} else if(direction2.equals("B")) {
						direction = Direction.LEFT;
					}
					break;
				case LEFT:
					if(direction2.equals("R")) {
						direction = Direction.UP;
					} else if(direction2.equals("L")) {
						direction = Direction.DOWN;
					} else if(direction2.equals("B")) {
						direction = Direction.RIGHT;
					}
					break;
				}
			}		
			if (onlyDirection.equals("m")) {
			switch (direction) {
				case UP:
						if(direction2.equals("F")) {
							startY += movingRangeT;
						} else if(direction2.equals("B")) {
							startY -= movingRangeB;
						} else if(direction2.equals("L")) {
							startX -= movingRangeLeft;
						} else if(direction2.equals("R")) {
							startX += movingRangeRight;
						} 
					break;
				case DOWN:
						if(direction2.equals("F")) {
							startY -= movingRangeT;
						} else if(direction2.equals("B")) {
							startY += movingRangeB;
						} else if(direction2.equals("L")) {
							startX += movingRangeLeft;
						} else if(direction2.equals("R")) {
							startX -= movingRangeRight;
						} 
					break;
				case RIGHT:			
						if(direction2.equals("F")) {
							startX += movingRangeT;
						} else if(direction2.equals("B")) {
							startX -= movingRangeB;
						} else if(direction2.equals("L")) {
							startY += movingRangeLeft;
						} else if(direction2.equals("R")) {
							startY -= movingRangeRight;
						} 
					break;
				case LEFT:
						if(direction2.equals("F")) {
							startX -= movingRangeT;
						} else if(direction2.equals("B")) {
							startX += movingRangeB;
						} else if(direction2.equals("L")) {
							startY -= movingRangeLeft;
						} else if(direction2.equals("R")) {
							startY += movingRangeRight;
						} 
					break;
				}
			}
 		}
		System.out.println(startX + " " + startY);
	}
}
