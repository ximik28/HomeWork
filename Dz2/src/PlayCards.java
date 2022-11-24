public class PlayCards {
    public static void main(String[] args) {
        int m = 3;
        int n = 8;
        switch (m) {
            case 1:
                if (n == 6) {
                    System.out.println("шестерка пик");
                } else if (n == 7) {
                    System.out.println("семерка пик");
                } else if (n == 8) {
                    System.out.println("восьмерка пик");
                } else if (n == 9) {
                    System.out.println("девятка пик");
                } else if (n == 10) {
                    System.out.println("десятка пик");
                } else if (n == 11) {
                    System.out.println("валет пик");
                } else if (n == 12) {
                    System.out.println("дама пик");
                } else if (n == 13) {
                    System.out.println("король пик");
                } else if (n == 14) {
                    System.out.println("туз пик");
                } else {
                    System.out.println("n должно быть в пределах 6-14 включительно");
                } break;
            case 2:
                if (n == 6) {
                    System.out.println("шестерка треф");
                } else if (n == 7) {
                    System.out.println("семерка треф");
                } else if (n == 8) {
                    System.out.println("восьмерка треф");
                } else if (n == 9) {
                    System.out.println("девятка треф");
                } else if (n == 10) {
                    System.out.println("десятка треф");
                } else if (n == 11) {
                    System.out.println("валет треф");
                } else if (n == 12) {
                    System.out.println("дама треф");
                } else if (n == 13) {
                    System.out.println("король треф");
                } else if (n == 14) {
                    System.out.println("туз треф");
                } else {
                    System.out.println("n должно быть в пределах 6-14 включительно");
                } break;
            case 3:
                if (n == 6) {
                    System.out.println("шестерка бубей");
                } else if (n == 7) {
                    System.out.println("семерка бубей");
                } else if (n == 8) {
                    System.out.println("восьмерка бубей");
                } else if (n == 9) {
                    System.out.println("девятка бубей");
                } else if (n == 10) {
                    System.out.println("десятка бубей");
                } else if (n == 11) {
                    System.out.println("валет бубей");
                } else if (n == 12) {
                    System.out.println("дама бубей");
                } else if (n == 13) {
                    System.out.println("король бубей");
                } else if (n == 14) {
                    System.out.println("туз бубей");
                } else {
                    System.out.println("n должно быть в пределах 6-14 включительно");
                } break;
            case 4:
                if (n == 6) {
                    System.out.println("шестерка червей");
                } else if (n == 7) {
                    System.out.println("семерка червей");
                } else if (n == 8) {
                    System.out.println("восьмерка червей");
                } else if (n == 9) {
                    System.out.println("девятка червей");
                } else if (n == 10) {
                    System.out.println("десятка червей");
                } else if (n == 11) {
                    System.out.println("валет червей");
                } else if (n == 12) {
                    System.out.println("дама червей");
                } else if (n == 13) {
                    System.out.println("король червей");
                } else if (n == 14) {
                    System.out.println("туз червей");
                } else {
                    System.out.println("n должно быть в пределах 6-14 включительно");
                } break;
            default:
            {
                System.out.println("m должно быть в пределах 1-4 включительно");
            }
        }
    }
}
