

import java.io.FileInputStream;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);

		int T = 10;
		for (int z = 1; z <= T; z++) {
			int n = sc.nextInt();
			int total = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			for (int i = 2; i < n - 2; i++) {
				if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2] && arr[i] > arr[i + 1] && arr[i] > arr[i + 2]) {
					int max = Math.max(arr[i - 1], arr[i - 2]);
					max = Math.max(max, arr[i + 1]);
					max = Math.max(max, arr[i + 2]);

					total += arr[i] - max;
				}
			}
			System.out.println("#" + z + " " + total);
		}
	}
}
