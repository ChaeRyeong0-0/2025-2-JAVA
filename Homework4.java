import java.util.Scanner;

public class Homework4 {
    public static int gcd(int m, int n){
        if(n==0)
            return m;

        return gcd(n, m%n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = gcd(m, n);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");
    }
}
