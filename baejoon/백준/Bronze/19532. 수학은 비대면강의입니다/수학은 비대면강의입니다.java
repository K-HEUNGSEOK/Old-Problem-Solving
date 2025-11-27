import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = -999;
        int y = 999;

        for(int i = x; i <= y; i ++){
            boolean check = false;
            for(int j = x ; j <= y; j ++){
                if ( (a*i) + (b*j) == c && (d*i) + (e*j) == f){
                    System.out.println(i + " " + j);
                    check =true;
                    break;
                }
            }
            if (check){
                break;
            }
        }
    }
}
