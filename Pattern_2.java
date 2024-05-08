
// Pattern 2 in java!

public class Pattern_2 {

    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
}
