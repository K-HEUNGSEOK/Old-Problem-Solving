import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> solution = solution(str);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < solution.size(); i ++){
            sb.append(solution.get(i));
        }
        System.out.println(sb);
    }

    private static List<Integer> solution(String str) {
        Integer result = Integer.parseInt(str);
        List<Integer> list = new ArrayList<>();

        while (result > 0){
            list.add(result % 10);
            result /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
