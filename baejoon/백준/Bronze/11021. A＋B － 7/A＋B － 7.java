import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            //Case #1: 1 + 1 = 2
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a + b;
            System.out.println("Case #" + (i+1) +": "+ total );
        }
    }
}
