import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int point = (int)Math.pow(2, n) + 1;
        System.out.println(point * point);
    }

}
