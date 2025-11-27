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
        int k = sc.nextInt();
        List<String> list = solution(n, k);
        String join = String.join(", ", list);
        System.out.print("<");
        System.out.print(join);
        System.out.print(">");
    }

    static List<String> solution(int n , int k) {
        List<String> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= n ; i++){
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for(int i = 1; i < k; i++){
                queue.offer(queue.poll());
            }
            int num = queue.poll();
            list.add(String.valueOf(num));
        }
        return list;
    }
}