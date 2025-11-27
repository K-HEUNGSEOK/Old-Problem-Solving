

import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for(int z = 1; z<= T; z ++) {
			int trash = sc.nextInt();
			char[][] arr = new char[100][100];
			for(int i = 0 ; i < 100; i ++) {
				arr[i] = sc.next().toCharArray();
			}
			
			int ans = 0;
			
			for(int i = 0 ; i < 100 ; i ++) {
				for(int j = 0 ; j < 100 ; j ++) {
					StringBuilder sb = new StringBuilder();
					sb.append(arr[i][j]);
					for(int k = j + 1 ; k < 100; k ++) {
						sb.append(arr[i][k]);
						if(isCheck(sb.toString())) {
							ans = Math.max(ans,  sb.length());
						}
					}
				}
			}
			
			for(int i = 0 ; i < 100 ; i ++) {
				for(int j = 0 ; j < 100 ; j ++) {
					StringBuilder sb = new StringBuilder();
					sb.append(arr[j][i]);
					for(int k = j + 1 ; k < 100; k ++) {
						sb.append(arr[k][i]);
						if(isCheck(sb.toString())) {
							ans = Math.max(ans,  sb.length());
						}
					}
				}
			}
			System.out.println("#" + trash + " " + ans);
			
		}
	}
	static boolean isCheck(String str) {
		for(int i = 0 ; i < str.length(); i ++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
		}
		return true;
	}
}
