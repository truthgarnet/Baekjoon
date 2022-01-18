package Baekjoon;

import java.util.Scanner;

public class Baekjoon10250 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			hotel(h, w, n);
		}
	}
	
	public static void hotel(int h, int w, int n) {
		int arr[][] = new int[h+1][w+1];
		int cnt = 0;
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= h; j++) {
				arr[i][j] = i;
				cnt++;
				if(n == cnt) {
					if(i < 10) {
						System.out.println(j+"0"+i);	
					}else {
						System.out.println(j+""+i);
					}
					
				}
			}
		}
	}
}
