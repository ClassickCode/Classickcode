// Spy Numbers in java!!

// import java.util.Scanner;

public class spy_num {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        int n = 114;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int rem = n % 10;

            sum = sum + rem;
            product = product * rem;

            n = n / 10;
        }
        if (sum == product) {
            System.out.println("Its a spy number");
        } else {
            System.out.println("It is not a spy number");
        }
    }
}
