package Baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int seq = 1;
		int sixplus = 0; //6 plus
		int cnt = 1;
		
		while(seq < n) {
			sixplus += 6;
			seq += sixplus;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
