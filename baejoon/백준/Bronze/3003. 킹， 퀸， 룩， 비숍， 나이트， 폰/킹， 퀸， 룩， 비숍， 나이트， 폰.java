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
        int k = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();

        print(k,1);
        print(q,1);
        print(l,2);
        print(b,2);
        print(n,2);
        print(p,8);
    }
    static void print(int x, int num){
        int s1 = num - x;
        System.out.print(s1 + " ");
    }

}