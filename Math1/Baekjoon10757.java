package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon10757 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger A = new BigInteger(a);
		BigInteger B = new BigInteger(b);
		System.out.print(A.add(B));
	}

}
