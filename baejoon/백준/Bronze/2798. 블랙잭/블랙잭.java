import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[101];

        for(int i = 0 ; i < n; i ++){
            nums[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (i == j) continue;
                for(int k = 0; k < n ; k ++){
                    if (i == k || k == j) continue;
                    int total = nums[i] + nums[j] + nums[k];

                    if (total > target) continue;
                    ans = Math.max(ans,total);
                }
            }
        }
        System.out.println(ans);
    }
}
