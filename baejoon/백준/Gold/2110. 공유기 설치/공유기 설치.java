import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));

    }
    static int solution(int n , int k , int [] arr){
        Arrays.sort(arr); //1. 정렬부터 한다
        int lt = 1, rt = arr[n-1]; // 2. lt와 rt를 설정함
        int ans = 0;
        while (rt >= lt){
            int mid = (lt+rt) / 2; //3. 정답이라고 가정하는 값
            if (count(arr, mid) >= k){
                ans = mid;
                lt = mid+1;
            }else{
                rt = mid-1;
            }
        }
        return ans;
    }

    private static int count(int[] arr, int mid) {
        int cnt = 1; //카운트
        int ep = arr[0]; //시작값은 고정임 모든 문제
        for(int i = 1; i < arr.length; i ++){
            if (arr[i] - ep >= mid){ //arr[i] 와 ep의 거리가 mid보다 크거나 같으면 유효값
                cnt ++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
