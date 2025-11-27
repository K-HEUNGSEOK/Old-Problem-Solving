import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        long result = getHashNumber(arr);
        System.out.println(result);
    }

    private static long getHashNumber(char[] arr) {
        long sum = 0;
        long r = 31;
        long mod = 1234567891;
        long pow = 1; // 31^0

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] - 'a' + 1; // 'a' → 1, 'b' → 2 ...
            sum = (sum + num * pow) % mod;
            pow = (pow * r) % mod;
        }
        return sum;
    }
}
