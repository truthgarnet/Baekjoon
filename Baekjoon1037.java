import java.util.*;
import java.util.Arrays;
import java.io.*;
public class Baekjoon1037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int result;
		int i = 0;
		
	    StringTokenizer st = new StringTokenizer(br.readLine()," ");
	    
	    while(st.hasMoreTokens()) {
	    	arr[i] = Integer.parseInt(st.nextToken());
	    	i++;
	    }
	    Arrays.sort(arr);
	    
 		result = arr[1] * arr[n];
 		System.out.print(result);
	}

}
