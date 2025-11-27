import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sort[] sorts = new Sort[n];
        for(int i = 0 ; i < n ; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sorts[i] = new Sort(x, y);
        }

        Arrays.stream(sorts).sorted((a,b) ->{
            if (a.y == b.y){
                return a.x - b.x;
            }
            return a.y - b.y;
        }).forEach(sort -> System.out.println(sort.x + " " + sort.y));
    }

    static class Sort{
        int x;
        int y;

        public Sort(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
