import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 낮에 올라가는 거리
        int b = sc.nextInt(); // 밤에 미끄러지는 거리
        int v = sc.nextInt(); // 도달해야 할 높이

        int days = (v - b - 1) / (a - b) + 1; // 

        System.out.println(days);
    }
}
