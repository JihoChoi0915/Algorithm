import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum=0;

        String s = br.readLine();
        String[] arr = s.split("");

        for(int i = 0; i<arr.length; i++){
            sum+=Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}