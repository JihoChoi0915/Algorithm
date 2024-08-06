import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a=0;
        boolean com;
        for(int i = 0; i<10; i++ ){
            int num = sc.nextInt();
            arr[i] = num%42;
        }

        for(int i = 0; i<arr.length; i++ ){
            com = false;
            for(int j = i+1; j<arr.length; j++ ){
                if(arr[i] == arr[j]){
                    com = true;
                    break;
                }
            }
            if(com==false)
                a++;
        }
        System.out.println(a);

    }
}