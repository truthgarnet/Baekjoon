package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon4948 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		while(true) {
			int n = Integer.parseInt(br.readLine()); 
			if(n == 0) {
				break;
			}
			if(n <= 123456) {
				System.out.println(prime(n));	
			}
		}  
	}
	public static int prime(int start) {
		int cnt = 0;
		int end = start * 2;
		boolean arr[] = new boolean[end + 1];
		
		for(int i = 2; i <= end; i++) {
			for(int j = i+i; j <= end; j+=i) {
				arr[j] = true;
			}
			if(arr[i] == true) {
				continue;
			}
		}
		for(int i = start + 1; i <= end; i++) {
			if(arr[i] == false) {
				cnt++;
			}
		}

		return cnt;
	}

}
