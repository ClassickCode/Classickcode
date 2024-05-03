public class Swapping2num {

    public static void main(String[] args) {
        System.out.println("Before swapping");
        int x = 10;
        int y = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        swap(x, y);

    }

    static void swap(int x, int y) {
        int temp = x; // 10
        x = y;
        y = temp;
        System.out.println("After swapping");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}