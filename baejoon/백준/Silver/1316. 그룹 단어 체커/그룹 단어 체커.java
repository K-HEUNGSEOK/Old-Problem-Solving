import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0 ; i < n; i ++){
            arr[i] = sc.next();
        }
        System.out.println(solution(arr));
    }
    static int solution(String[] arr){
        int cnt = 0;
        for (String str : arr) {
            int checkCnt = 0;
            boolean check = false;
            for(int i = 0 ; i < str.length(); i ++){
                char target = str.charAt(i);
                int idx = str.length();
                for(int j = i + 1; j < str.length(); j ++){
                    if (target != str.charAt(j)){
                        idx = j;
                        break;
                    }
                }
                if (str.indexOf(target+"",idx)== -1){ //없으면 통과임
                    checkCnt ++;
                }
            }

            if (checkCnt == str.length()){
                check = true;
            }
            if (check){
                cnt ++;
            }
        }
        return cnt;
    }

}