    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
            
            Scanner sc = new Scanner(System.in);
            while (true){
                String str = sc.next();
                if (str.equals("0")){
                    break;
                }
                if (plaindrom(str)){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
        }

        private static boolean plaindrom(String str) {
            int start = 0;
            int end = str.length()-1;

            while (start <= end){
                if (str.charAt(start) != str.charAt(end)){
                    return false;
                }
                start ++;
                end --;
            }
            return true;
        }
    }