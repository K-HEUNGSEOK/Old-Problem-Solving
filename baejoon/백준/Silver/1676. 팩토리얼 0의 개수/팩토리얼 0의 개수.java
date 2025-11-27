import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //"주어진 N에 대해 N!의 결과에서, 일의 자리부터 왼쪽으로 한자리씩 살피어 0이 아닌
        // 숫자가 나오기 전까지의 0의 개수를 구하시오.
        //예를 들어, 10! = 3628800이고, 일의 자리에서부터 0이 아닌 숫자인 8이 나올 때까지
        // 0의 개수는 2개이다."
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 5; i <= n ; i *= 5){
            cnt += n/i;
        }
        System.out.println(cnt);
    }
}
