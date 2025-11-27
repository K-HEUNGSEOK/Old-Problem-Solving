

import java.io.FileInputStream;
import java.util.*;

public class Solution {
	static int num, cnt, ans;
	static boolean[][] ch;

	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			cnt = sc.nextInt();
			ans = 0;
			ch = new boolean[1000001][cnt + 1];
			DFS(num, 0);
			System.out.println("#" + (i+1)+ " " + ans);
		}
	}

	static void DFS(int num, int c) {

		if (c == cnt) {
			if (ans > num)
				return;
			ans = Math.max(ans, num);
			return;
		}
		if (ch[num][c])
			return;

		ch[num][c] = true;

		char[] arr = (num + "").toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				DFS(Integer.parseInt(new String(arr)), c + 1);
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

	}
}
