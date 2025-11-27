import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0 ; i < n ; i ++){
            int weight = sc.nextInt();
            int height = sc.nextInt();
            students[i] = new Student(weight,height);
        }

        for(int i = 0; i < n ; i ++){
            int cnt = 1;
            for(int j = 0 ; j < n ; j ++){
                if (i==j) continue;
                int weight = students[i].weight;
                int height = students[i].height;

                if (weight < students[j].weight && height < students[j].height){
                    cnt ++;
                }
            }
            students[i].setIndex(cnt);
        }
        for (Student student : students) {
            System.out.print(student.index + " ");
        }
    }
    static class Student{
        int weight;
        int height;
        int index;
        public Student(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}

