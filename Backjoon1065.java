package Baekjoon;

import java.util.Scanner;

public class Baekjoon1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i < n + 1; i++) {
			if(i <= 99) {
				result++;
			}else {
				if(hansoo(i) == true) {
					result++;
					if(i == 1000) {
						result--;
					}
				}
			}
		}
		System.out.print(result);
	}
	
	public static boolean hansoo(int n) {
		int arr[] = new int[4];
		int i = 0;
		boolean check = false;
		
		while(n != 0) {
			arr[i] = n % 10;
			n /= 10;
			i++;
		}
		if(arr[0] - arr[1] == arr[1] - arr[2]) {
			check = true;
		}
		
		return check;
	}
}
