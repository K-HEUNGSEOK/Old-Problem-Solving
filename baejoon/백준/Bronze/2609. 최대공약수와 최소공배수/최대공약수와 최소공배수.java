    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
         
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b =sc.nextInt();

            System.out.println(gcd(a,b));
            System.out.println(lcm(a, b , gcd(a,b)));
        }

        private static int lcm(int a, int b, int gcd) {
            return a * b / gcd;
        }

        private static int gcd(int a, int b) {
            if (b == 0){
                return a;
            }

            return gcd(b, a%b);
        }
    }