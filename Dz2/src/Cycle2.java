public class Cycle2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i % 5 == 0) {
                System.out.println(i);
            }
        } while (i <= 99);
    }
}
