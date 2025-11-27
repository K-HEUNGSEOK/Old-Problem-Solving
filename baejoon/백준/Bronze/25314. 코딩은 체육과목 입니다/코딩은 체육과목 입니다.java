import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "long";
        String space = " ";
        String end = "int";

        int repeater = n / 4;
        for(int i = 0 ; i < repeater ; i ++){
            System.out.print(str + space);
        }
        System.out.print(end);
    }
}
