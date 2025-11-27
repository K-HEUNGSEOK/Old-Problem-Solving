    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.security.spec.RSAOtherPrimeInfo;
    import java.util.Arrays;
    import java.util.Scanner;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
         
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(solution(n, k));
        }
        static int solution(int n, int k) {
                int cnt = 0;
                int[] arr = new int [n + 1];

                for(int i = 2; i <= n ; i ++){
                    if (arr[i] == 0){ //소수면
                        //그 배수만큼 계속 지워버려라
                        for(int j = i; j <= n; j += i){
                            if (arr[j] == 1){
                                continue;
                            }
                            arr[j] = 1;
                            cnt ++;
                            
                            if (cnt == k){
                                return j;
                            }
                        }
                    }
                }
                return 0;
            }
        }