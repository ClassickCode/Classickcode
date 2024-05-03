import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a, b, c;
        a = 0;
        b = 1;
        c = 0;

        while (a <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}