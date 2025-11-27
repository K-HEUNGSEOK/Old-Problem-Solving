import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0 ; i < T; i++){
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Target> queue = new ArrayDeque<>();
        for(int j = 0 ; j < N; j ++){
            int num = sc.nextInt();
            queue.offer(new Target(j,num));
        }
        int solution = solution(N, M, queue);
        System.out.println(solution);
        }

    }
    static int solution(int n, int m , Queue<Target> queue){
        int cnt = 0;
        while (true){
            Target pop = queue.poll();
            boolean check = true;
            for (Target target : queue) {
                if (pop.num < target.num){
                    check = false;
                    break;
                }
            }
            if (check){
                cnt++;
                if (pop.idx == m){
                    return cnt;
                }
            }else{
                queue.offer(pop);
            }
        }
    }

    static class Target{
        int idx;
        int num;

        public Target(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
}