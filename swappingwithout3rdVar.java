// Swapping without the 3rd Variable!!

public class swappingwithout3rdVar {

    public static void main(String[] args) {
        System.out.println("Before swapping");
        int a = 10;
        int b = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        swap(a, b);
    }

    static void swap(int a, int b) {
        a = a + b; // 30
        b = a - b; // 30-20 = 10
        a = a - b; // 30 - 10 = 20
        System.out.println("After swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
