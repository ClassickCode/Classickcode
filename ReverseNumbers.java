// Reversing the number in java

public class ReverseNumbers {

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Original Number: " + n);
        System.out.print("Reversed Number: ");

        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}
// Thank youuu
// .@classickcode
// follow for more
