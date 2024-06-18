import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt(); //요리 입력 시간

        m = h * 60 + m;
        m = m + s;

        h = (m/60) % 24;
        int min = m % 60;

        System.out.println(h + " " + min);
    }
}