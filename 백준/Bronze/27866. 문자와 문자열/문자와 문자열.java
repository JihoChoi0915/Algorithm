import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        String[] arr = s.split("");
        for (int i = 1; i <= arr.length; i++) {
            if (i == n)
                System.out.println(arr[i-1]);
        }

    }
}