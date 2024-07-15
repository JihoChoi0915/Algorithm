import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        for (int i = 0 ; i<arr.length; i++)
            if (arr[i] == max)
                System.out.println(i + 1);
    }
}
