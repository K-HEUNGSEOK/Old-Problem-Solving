import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    static String[] target = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str);
    }
    static void print(String str){
        for (String s : target) {
            if (str.contains(s)){
                str = str.replace(s, "*");
            }
        }
        System.out.println(str.length());
    }

}