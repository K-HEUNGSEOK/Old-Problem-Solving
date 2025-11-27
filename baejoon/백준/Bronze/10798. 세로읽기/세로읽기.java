import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[15][5];
        for(int i = 0 ; i < 5 ; i ++){
            arr[i] = sc.next().toCharArray();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 15 ; i ++){
            for(int j = 0; j < 5 ; j ++){
                if (i < arr[j].length){
                    char c = arr[j][i];
                    if (Character.isAlphabetic(c) || Character.isDigit(c)){
                        sb.append(c);
                    }
                }
            }
        }
        
        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
