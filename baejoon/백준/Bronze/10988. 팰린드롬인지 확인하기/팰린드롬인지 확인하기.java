import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        //첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
        String str = sc.next();
        System.out.println(solution(str));
    }
    private static int solution(String str){
        int start = 0;
        int end = str.length()-1;

        while (end >= start){
            if (str.charAt(start) != str.charAt(end)){
                return 0;
            }
            start ++;
            end --;
        }
        return 1;
    }
}