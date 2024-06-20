import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = 0;

        for (int i = 1; i <= n; i++) {
            w += 1;
            if (w % 4 == 0)
                System.out.print("long ");
        }
        System.out.println("int");
    }
}