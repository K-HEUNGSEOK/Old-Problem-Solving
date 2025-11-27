import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> prime = getPrime(n,m);
        int sum = 0;
        for (Integer integer : prime) {
            sum += integer;
        }
        if (prime.isEmpty()){
            System.out.println(-1);
        }else{
        System.out.println(sum);
        System.out.println(prime.get(0));
        }
    }

    private static List<Integer> getPrime(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean [] check = new boolean[m+1];
        Arrays.fill(check,true);
        check[0] = false;
        check[1] = false;
        int limit = (int)Math.sqrt(m);
        for(int i = 2; i <= limit ; i++){
            if (check[i]){
                for(int j = i*i ; j <= m; j +=i){
                    check[j] = false;
                }
            }
        }

        for(int i = n; i <=m ; i++){
            if (check[i]){
                list.add(i);
            }
        }
        return list;
    }
}
