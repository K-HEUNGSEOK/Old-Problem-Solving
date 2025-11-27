import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //m 의 분해합이 n 이면 생성자, 그럼 m의 분해합으로 n 을 만들 수 있는 가장 작은수
        System.out.println(plus(n));
    }
    static int plus(int target){
        int ans = 0;
        for(int i = 1; i <=1000000;  i ++){
            if (isChecked(i) == target){
                ans = i;
                return ans;
            }
        }
        return ans;
    }

    static int isChecked(int num){
        int total = num;
        String str = String.valueOf(num);
        for(int i = 0 ; i < str.length(); i++){
            total += str.charAt(i) - '0';
        }
        return total;
    }
}
