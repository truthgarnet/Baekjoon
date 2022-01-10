package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2869 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B= Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		if((V-A) % (A-B) == 0) {
			System.out.print((V-A) / (A-B) + 1);
		}else {
			System.out.print((V-A) / (A-B) + 2);
		}	
		
	}
}
