import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 2000000;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(min > a) min = a;
        }
        System.out.println(min);
    }
}
