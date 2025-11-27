import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i ++){
            for(int j = n-1 ; j > i; j --){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i*2; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-2 ; i >= 0 ; i --){
            for(int j = n-1 ; j > i; j --){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i*2; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
