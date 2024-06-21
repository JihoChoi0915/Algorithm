import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] N = new int[A];

        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < A; i++) {
            N[i] = Integer.parseInt(st.nextToken());
            if(N[i] < X)
                bw.write(N[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
