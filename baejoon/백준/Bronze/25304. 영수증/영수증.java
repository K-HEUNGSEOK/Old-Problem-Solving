import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int total = a * b;
            sum += total;
        }
        if (sum == target){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
