import java.util.Scanner;
public class Loop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
            if(i%2!=0) sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
