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
        for(int i = 0 ; i < n ; i ++){
            if(solution(sc.next())) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static boolean solution(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < str.length(); i ++){
            if (arr[i] == '(') stack.push(arr[i]);
            else {
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}