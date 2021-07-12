package TryPaizaB;
import java.util.Arrays;
import java.util.Scanner;

public class PaizaB034_2 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int r = sc.nextInt();
int c = sc.nextInt();
String[] t = new String[r];
for(int i = 0; i < r; i++) {
t[i] = sc.next(
);
}
System.out.println(Arrays.toString(t));


char[][] robot = new char[r][c];
for(int i = 0; i < r; i++) {
char[] t1 = t[i].toCharArray();
for(int j = 0; j < c; j++) {
robot[i][j] = t1[j];
}
}
//System.out.println(Arrays.toString(robot));
// dong khung robot[] lai bang 4 buc tuong #
char[][] R = new char[r+2][c+2];
for(int i = 1; i < r+1; i++) {
for(int j = 1; j < c+1; j++) {
R[i][j] = robot[ i-1][j-1];
}
}
// luc nay diem bat dau ko con la 0, 0 nua ma la 1, 1
int goc = 90;
int h0 = 1, w0 = 1;
while(true) {
if(R[h0][w0] == '.') { // robot di qua . thi diem do bien thanh #
R[h0][w0] = '#';
}
// cac huong di cua robot, neu gap # thi re phai(+90 do)
if(goc == 0) {
	if(R[h0-1][w0] == '#') {
		goc += 90;
} else {
h0--;
}
} if(goc == 90) {
if(R[h0][w0+1] == '#') {
goc += 90;
} else {
w0++;
}
} if(goc == 180) {
if(R[h0+1][w0] == '#') {
goc += 90;
} else {
h0++;
}
} if(goc == 270){
if(R[h0][w0-1] == '#') {
goc += 90;
} else {
w0--;
}
}
if(goc >= 360) {
goc -= 360;
}
// neu xung quanh 4 huong deu la # thi finish
if(R[h0-1][w0] == '#' && R[h0][w0-1] == '#'
&& R[h0+1][w0] == '#' && R[h0][w0+1] == '#') {
System.out.println((w0-1) + " " + (h0-1));
break;
}
}

sc.close();

}

}