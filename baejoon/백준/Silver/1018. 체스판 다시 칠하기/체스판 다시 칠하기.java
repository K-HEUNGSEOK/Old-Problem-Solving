import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int[] dx = {0,1};
    static int[] dy = {1,0};

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        char[][] chess = new char[n][m];
        for(int i = 0 ; i < n ; i ++){
            chess[i] = sc.next().toCharArray();
        }
        int ans = Integer.MAX_VALUE;

        char[][] whiteStart = white('W');
        char[][] BlackStart = white('B');


        for(int i = 0 ; i <= n - 8; i ++){
            for(int j = 0 ; j <= m-8; j ++){
                int countA = 0;
                int countB = 0;
                int x = 0;
                for(int k = i + 0; k < i + 8; k ++){
                    int y = 0;
                    for(int l = j + 0; l < j + 8; l ++){
                        char target = chess[k][l];
                        char first = whiteStart[x][y];
                        char second = BlackStart[x][y];

                        if (target != first){
                            countA ++;
                        }
                        if (target != second){
                            countB ++;
                        }
                        y ++;
                    }
                    x ++;
                }
                ans = Math.min(ans,Math.min(countA,countB));
            }
        }
        System.out.println(ans);
    }
    static char[][] white (char fistColor){
        char [][] arr = new char[8][8];
        char secondColor = (fistColor == 'W') ? 'B' : 'W';
        for(int i = 0 ; i < 8 ; i ++){
            char c;
            if (i % 2 == 0){
                c = fistColor;
            }else {
                c = secondColor;
            }
            for(int j = 0 ; j < 8; j ++){
                arr[i][j] = c;
                if (c == 'W'){
                    c = 'B';
                }else{
                    c = 'W';
                }
            }
        }
        return arr;
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}
