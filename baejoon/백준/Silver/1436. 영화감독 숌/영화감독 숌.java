    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            
            Scanner sc = new Scanner(System.in);
            int[] arr= new int [10001];
            int n = sc.nextInt();
            arr[1] = 666;
            int cnt = 1;
            int j = 666;
            for(int i = 2; i <= n; i ++){
                while (cnt < i){
                    j ++;
                    String value = String.valueOf(j);

                    if (value.contains("666")){
                        cnt ++;
                    }
                }
                arr[i] = j;
            }
            System.out.println(arr[n]);
        }
    }
