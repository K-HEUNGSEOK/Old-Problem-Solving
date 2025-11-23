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
        Stack<Integer > stack = new Stack<>();
        for(int i = 0 ; i < n ; i ++){
            int num = sc.nextInt();
            if (num == 0){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.add(num);
            }
        }
        int total = 0;
        for (Integer integer : stack) {
            total += integer;
        }
        System.out.println(total);

    }
    static void solution(HashMap<Integer,Integer> map ,int[]target ){

    }
}