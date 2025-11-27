import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i ++){
            int n = sc.nextInt();
            String str = solution(n);
            System.out.println(str);
        }
     }

    private static String solution(int num) {
        List<String> list = new ArrayList<>();
        int[] arr = {25,10,5,1};

        for (int i : arr) {
            list.add(String.valueOf(num / i));
            num %= i;
        }
        return String.join(" ", list);
    }
}
