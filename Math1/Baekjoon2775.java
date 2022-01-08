package Baekjoon;

import java.util.Scanner;

public class Baekjoon2775 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int floor[][] = new int[15][15];
		
		
		
		for(int j = 0; j < 15; j++) {
			floor[0][j] = j; 
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				floor[i][j] = floor[i-1][j] + floor[i][j-1];
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(floor[k][n]);
		}
		
	}
	
	
}
