    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[6];
            for(int i = 0 ; i < 6; i ++){
                arr[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int p = sc.nextInt();
            int cnt = 0;
            for(int i = 0 ; i < 6 ; i ++){
                cnt += arr[i] / t;
                if (arr[i] % t != 0){
                    cnt ++;
                }
            }
            System.out.println(cnt);
            System.out.println((n / p) + " " + (n % p));
        }
    }