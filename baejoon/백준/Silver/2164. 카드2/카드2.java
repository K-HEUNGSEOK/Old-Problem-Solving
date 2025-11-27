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
        System.out.println(solution(n));

    }
    static int solution(int n){
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1 ; i <= n ; i ++){
            queue.offer(i);
        }
        while (true){
            if (queue.size() == 1){
                break;
            }
            int a = queue.poll();
           
            int b = queue.poll();

            queue.offer(b);
        }
        return queue.poll();
    }
}