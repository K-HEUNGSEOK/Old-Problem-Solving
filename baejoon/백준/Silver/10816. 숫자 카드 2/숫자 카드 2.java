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
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < n ; i ++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int m = sc.nextInt();
        int [] target = new int[m];
        for(int i = 0 ; i < m ; i ++){
            int num = sc.nextInt();
            target[i] = num;
        }
        solution(map,target);

    }
    static void solution(HashMap<Integer,Integer> map ,int[]target ){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < target.length; i ++){

            sb.append(map.getOrDefault(target[i],0)).append(" ");
        }
        System.out.println(sb.toString());
        }
    }