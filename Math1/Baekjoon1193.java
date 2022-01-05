package Baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while(n > i) {
			n -= i;
			i++;				
		}
		
		if(i % 2 == 0) {
			System.out.print((n) + "/" + (i + 1 - n));
		}else {
			System.out.print((i + 1 - n) + "/" + (n));
		}
	}

}
