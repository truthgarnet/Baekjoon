package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();			
			String arr[] = s.split(" ");
			for(int j = 0; j < arr.length; j++) {
				result += Checker(arr[j]);
			}
		}

		System.out.print(result);
	}
	
	public static int Checker(String arr) {

		String check[] = arr.split("");
		int cnt = 0;
		int arrayCnt = 0;
		int result = 0;
		
		for(int i = 1; i < check.length; i++) {		
			if(check[i-1].equals(check[i])){
				cnt++;		
			}
		}
		
		Arrays.sort(check);
		for(int i = 1; i < check.length; i++) {		
			if(check[i-1].equals(check[i])){
				arrayCnt++;
			}			
		}
		if(cnt == arrayCnt) {
			result++;
		}
		return result;
	}
}
