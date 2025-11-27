import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(getNumber(n,k));

    }

    private static int getNumber(int n, int k) {
        int first = factorial(n);
        int second = factorial(k);
        int third = factorial(n - k);

       return first / (second * third);
    }

    private static int factorial(int n ){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}

