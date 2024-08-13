import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] arr = new String[T];
        for(int i = 0; i<T; i++){
            arr[i] = br.readLine();
        }

        for(int i =0; i<T; i++){
            System.out.println(arr[i].charAt(0)+ "" + arr[i].charAt(arr[i].length()-1));
        }
    }
}