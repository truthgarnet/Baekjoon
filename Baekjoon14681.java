import java.util.Scanner;

public class Baekjoon14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		short a = sc.nextShort();
		short b = sc.nextShort();
		
		if(a > 0) {
			if(b > 0) {
				System.out.print("1");
			}else {
				System.out.print("4");
			}
		}else {
			if(b > 0) {
				System.out.print("2");
			}else {
				System.out.print("3");
			}
		}
	}

}
