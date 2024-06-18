import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h==0 && m<45){
            h=23;
            System.out.println(h+" "+ (m+60-45));
        } else if (m < 45) {
            System.out.println((h-1)+" "+(m+60-45));
        }else
            System.out.println(h + " " + (m-45));
    }
}