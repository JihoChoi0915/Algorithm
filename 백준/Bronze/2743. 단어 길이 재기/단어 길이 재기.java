import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int sum=0;
        for(int i = 0; i < s.length; i++){
            sum++;
        }
        System.out.println(sum);
    }
}