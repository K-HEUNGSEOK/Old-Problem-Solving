    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
         
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;

            for(int i = 0 ; i < n ; i ++){
                if (isPrimeCheck(arr[i])){
                    count++;
                }
            }
            System.out.println(count);
        }

        private static boolean isPrimeCheck(int num) {
            if (num == 1){
                return false;
            }
            if (num == 2){
                return true;
            }
            for(int i = 2 ; i < num; i ++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }