public class MaxSum {
    public static void main(String[] args) {
        int a = 10;
        int b = 140;
        int c = 100;
        if (a > b && b > c) {
            System.out.println(a + b);
        }
        else if (a > b && c > b) {
            System.out.println(a + c);
        }
        else {
            System.out.println(b + c);
        }
    }
}
