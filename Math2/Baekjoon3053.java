package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3053 {
	public static double pi = 3.14159265358979;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		
		double euclid = pi * r * r; 
		double taxi = 2 * r * r;
		String result1 = String.format("%.6f", euclid);
		String result2 = String.format("%.6f", taxi);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
