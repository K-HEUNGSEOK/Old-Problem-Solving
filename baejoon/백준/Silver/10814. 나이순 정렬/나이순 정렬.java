import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Test [] test = new Test[n];

        for(int i = 0 ; i < n ; i ++){
            int age = sc.nextInt();
            String name = sc.next();
            test[i] = new Test(age,name,i);
        }
        Arrays.sort(test);

        StringBuilder sb = new StringBuilder();
        for (Test test1 : test) {
            sb.append(test1.age + " " + test1.name).append("\n");
        }
        System.out.println(sb);
    }
    static class Test implements Comparable<Test>{
        int age;
        String name;
        int index;

        public Test(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
        @Override
        public int compareTo(Test o){
            if (this.age == o.age){
                return this.index - o.index;
            }
            return this.age - o.age;
        }
    }
}

