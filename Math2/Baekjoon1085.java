package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1085 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int result_w = x;
		int result_h = y;
		int result = 0;
		
		if(x - 0> w - x) {
			result_w = w - x;
		}
		if(y - 0 > h - y) {
			result_h = h - y;
		}
		
		if(result_h < result_w) {
			result = result_h;
		}else {
			result = result_w;
		}
		
		System.out.print(result);
 	}

}
