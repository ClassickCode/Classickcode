// Half Diamond in java!!

public class Pattern_3 {

    public static void main(String[] args) {
        int n = 5;
        int totalcolsinrow = 0;

        for (int row = 0; row < 2 * n; row++) {

            if (row > n) {
                totalcolsinrow = 2 * n - row;

            } else {
                totalcolsinrow = row;
            }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}