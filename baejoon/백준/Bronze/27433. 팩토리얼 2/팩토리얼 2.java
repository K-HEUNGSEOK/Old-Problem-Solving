import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = dfs(n);
        System.out.println(d);
    }
    static long dfs(int n){
        if (n == 0){
            return 1;
        }
        return n * dfs(n-1);
    }
}