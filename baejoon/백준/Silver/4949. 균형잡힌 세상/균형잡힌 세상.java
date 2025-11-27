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
        List<String> list = new ArrayList<>();
        while (true){
            String str = sc.nextLine();
            if (str.equals(".")){
                break;
            }
            list.add(str);
        }
        solution(list);

    }
    static void solution(List<String> list){
        for (String str : list) {
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int i = 0 ; i < str.length(); i ++){
                if (str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack.push(str.charAt(i));
                }
                else if(str.charAt(i) == ')' || str.charAt(i) == ']'){
                    if (stack.isEmpty()){
                        check = false;
                        break;
                    }

                    Character pop = stack.pop();
                    if (pop == '(' && str.charAt(i) != ')'){
                        check = false;
                        break;
                    }else if(pop == '[' && str.charAt(i) != ']'){
                        check= false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()){
                check = false;
            }
            if (str.length() > 100 || str.charAt(str.length()-1) != '.'){
                check =false;
            }

            if (check){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}