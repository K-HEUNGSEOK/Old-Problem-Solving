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
        char[] arr = sc.next().toCharArray();
        System.out.println(solution(arr));
    }

    static int solution(char[] arr) {
       int ans = 0;
       Stack<Character> stack = new Stack<>();
       for(int i = 0 ; i < arr.length; i++){
           if (arr[i] == '(') stack.push(arr[i]);
           else {
               if (arr[i-1] == '(') { //레이저임
                   stack.pop();
                   ans += stack.size();
               }else{
                   stack.pop();
                   ans++;
               }
           }
       }
       return ans;
    }
}