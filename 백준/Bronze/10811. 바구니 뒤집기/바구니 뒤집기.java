import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        for (int k = 1; k <= N; k++) {
            arr[k] = k;
        }

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(bf.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while (i<j) {

                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;

            }
        }
        for(int k = 1 ; k <= N; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}