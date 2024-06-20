import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //총 금액
        int n = sc.nextInt(); //물건의 종류

        int sum=0;

        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt(); //물건의 가격
            int b = sc.nextInt(); //물건의 개수
            sum += a*b;
        }
        if(sum == x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}