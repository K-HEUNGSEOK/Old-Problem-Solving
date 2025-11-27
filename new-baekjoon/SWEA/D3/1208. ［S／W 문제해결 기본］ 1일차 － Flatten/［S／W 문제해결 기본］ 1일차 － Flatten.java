

import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for(int z = 1; z<= T; z ++) {
		int n = sc.nextInt();
		int [] arr = new int[100];
		for(int i = 0 ; i < 100 ; i ++) arr[i] = sc.nextInt();
		int cnt = 0;
		int temp = n;
		Arrays.sort(arr);
		while(n -- > 0) {
			arr[0] ++;
			arr[99] --;
			if(arr[99] - arr[0] <= 1) {
				break;
			}
			Arrays.sort(arr);
		}
		Arrays.sort(arr);
		System.out.println("#" + z+ " " + (arr[99] - arr[0]));
		}
	}
}
