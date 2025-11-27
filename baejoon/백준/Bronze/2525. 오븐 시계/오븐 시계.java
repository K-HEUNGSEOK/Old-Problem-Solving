import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int minute = sc.nextInt();
        int run = sc.nextInt();

        minute += run;
        while (minute >= 60){
        minute -= 60;
            time ++;
        if (time == 24){
            time = 0;
        }
        }
        System.out.println(time + " " + minute);
    }
}
