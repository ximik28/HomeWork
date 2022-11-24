public class Year {
    public static void main (String[] args) {
        int year = 1900;
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("365");
        } else if (year % 4 == 0) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }
    }
}
