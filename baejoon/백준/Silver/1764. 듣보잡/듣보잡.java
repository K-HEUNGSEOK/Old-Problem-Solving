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
        Set<String> target = new HashSet<>();
        for(int i = 0 ; i < n ; i ++){
            target.add(sc.next());
        }
        Set<String> test = new HashSet<>();
        for(int i = 0 ; i < m ; i ++){
            test.add(sc.next());
        }
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for (String s : test) {
            if (target.contains(s)){
                list.add(s);
                cnt ++;
            }
        }
        System.out.println(cnt);
        list.sort((a,b) -> a.compareTo(b));
        for (String s : list) {
            System.out.println(s);
        }
    }

//    static int solution(int n) {
//
//    }

}

