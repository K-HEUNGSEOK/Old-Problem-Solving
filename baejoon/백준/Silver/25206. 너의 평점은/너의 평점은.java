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
        int n = 20;
        Student [] students = new Student[n];
        for(int i = 0 ; i < n ; i ++){
            String str = sc.nextLine();
            String[] split = str.split(" ");
            double num = Double.parseDouble(split[1]);
            String grade = split[2];
            students[i] = new Student(num,grade);
        }

        System.out.println(solution(students));
    }
    static double solution(Student[] students){
        double total = 0;
        double division = 0;
        for (Student student : students) {
            if (student.grade.equals("P")){
                continue;
            }
            total += student.num * getGrade(student.grade);
            division += student.num;
        }
        double result = total / division;
        return result;
    }
    static double getGrade(String grade){
        //A+	4.5
        //A0	4.0
        //B+	3.5
        //B0	3.0
        //C+	2.5
        //C0	2.0
        //D+	1.5
        //D0	1.0
        //F	0.0
        switch (grade){
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
        }
        return 0;
    }

    static class Student{
        double num;
        String grade;

        public Student(double num, String grade) {
            this.num = num;
            this.grade = grade;
        }
    }
}