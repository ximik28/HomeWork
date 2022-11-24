public class ArOper {
    public static void main(String[] args) {
        int action = 1;
        double a = 13.9;
        int b = 4;
        switch (action) {
            case 1:
                System.out.println(a + b); break;
            case 2:
                System.out.println(a - b); break;
            case 3:
                System.out.println(a * b); break;
            case 4:
                System.out.println(a / b); break;
            default:
                System.out.println("Вы ввели неправильное число!");
        }
    }
}
