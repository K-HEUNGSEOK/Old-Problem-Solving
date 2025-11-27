import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isCheck(n));

    }
    static int isCheck(int n){
        if (n == 3 || n == 5){
            return 1;
        }
        if (n % 5 == 0){
            return n / 5;
        }


        if (n > 5){
        int[] arr = new int[1001];
        int cnt = 0;
        int temp = n;
        boolean check = false;
        while (temp > 5){
            temp -= 5;
            cnt ++;

            if (temp % 3 == 0){
                arr[cnt] ++;
                check = true;
            }
        }
        if (check) {
            int ans5 = 0;
            int ans3 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    ans5 = i;
                }
            }

            ans3 = (n - (5 * ans5)) / 3;
            int total = ans5 + ans3;
            return total;
        }
        }


        if (n % 3 == 0){
            return n / 3;
        }

        return -1;
    }
}
