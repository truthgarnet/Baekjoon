package Baekjoon;

import java.util.Arrays;

public class Baeckjoon4673 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[] arr = new Boolean[10000];
		Arrays.fill(arr, false);
		int i = 0;
		
		while(i < 10000) {
			int index = SelfNum(i);
			if(index < 10000) {
				arr[index] = true;
			}

			i++;
		}
		for(int j = 0; j < 10000; j++) {
			if(arr[j] == false) {
				System.out.println(j);
			}
		}

	}
	
	public static int SelfNum(int n) {
		int sum = n;
		while(n != 0) {	
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
