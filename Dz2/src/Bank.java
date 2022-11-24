public class Bank {
    public static void main(String[] args) {
        double vklad = 1000;
        double p = 1.25;
        int month = 0;
        do {
            vklad = vklad + vklad * (p/100);
            month++;
        } while (vklad < 1100);
        System.out.println("Через " + month + " мес. вклад превысит 1100 рублей. ");
        System.out.println("Сумма вклада равна " + vklad + " руб.");
    }
}
