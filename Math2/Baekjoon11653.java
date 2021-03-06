package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11653 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		if(factorization(n) != 0) {
			System.out.println(factorization(n));	
		}
		 
	}
	public static int factorization(int n) {
		int i = 1;
		
		while(n > 1) {
			i++;
			if(n % i == 0) {
				System.out.println(i);
				return factorization(n / i);	
			}
			
		}
			return 0;
	}
}
