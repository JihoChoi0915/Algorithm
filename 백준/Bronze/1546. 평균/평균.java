import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > M)
                M = arr[i];
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / (double)(M)) * 100;
        }

        System.out.println(sum/arr.length);
    }
}