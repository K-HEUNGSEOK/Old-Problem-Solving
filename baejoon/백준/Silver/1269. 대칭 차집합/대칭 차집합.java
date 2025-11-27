import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> target = new HashSet<>();
        for(int i = 0 ; i < n ; i ++){
            target.add(sc.nextInt());
        }
        Set<Integer> test = new HashSet<>();
        for(int i = 0 ; i < m ; i ++){
            test.add(sc.nextInt());
        }
        int cnt = 0;
       Set<Integer> set =  new HashSet<>(target);
       set.removeAll(test);
        test.removeAll(target);
        System.out.println(set.size() + test.size());
    }

//    static int solution(int n) {
//
//    }

}

