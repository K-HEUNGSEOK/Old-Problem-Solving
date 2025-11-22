

import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for(int z = 1; z<= T; z ++) {
			int trash = sc.nextInt();
			String target = sc.next();
			String str = sc.next();
			int ans =0;
			
			while(true) {
				int index = str.indexOf(target);
			
				if(index == -1) {
					break;
				}
				ans ++;
				str = str.substring(index+1);
				
			}
			System.out.println("#" +  z+ " " +ans);
		}
	}
}
