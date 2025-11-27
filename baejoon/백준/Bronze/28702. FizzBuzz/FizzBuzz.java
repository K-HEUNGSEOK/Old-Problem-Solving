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
        String[] str = new String[3];
        for(int i = 0 ;i < 3; i ++){
            str[i] = sc.next();
        }
        solution(str);
    }

    static void solution(String [] str){
        int [] arr = new int[3];
        int ans = 0;
        int index = -1;
        //자 먼저 숫자부터 담는거야
        for (int i = 0 ; i < str.length; i ++){
            if(str[i].charAt(0) == 'F' || str[i].charAt(0) == 'B') continue;

            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i] > ans){
                ans = arr[i];
                index = i;
            }
        }

        //제일 큰 숫자를 발견했다! 0 1 2 중에 max 값이 만약 0 이면 + 3
        //1이면 + 2, 2 면 + 1 하면 되네?
        if (index == 0){
            ans += 3;
        }else if(index == 1){
            ans += 2;
        }else {
            ans += 1;
        }

        if (ans % 3 == 0 && ans % 5 ==0){
            System.out.println("FizzBuzz");
        }else if(ans % 3 == 0){
            System.out.println("Fizz");
        }else if(ans % 5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(ans);
        }
    }
}
