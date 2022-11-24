public class DesNum {
    public static void main(String[] args) {
        int s = -180;
        if (s >= 0 && s < 10 && s % 2 == 0) {
            System.out.println("однозначное четное число");
        } else if (s >= 0 && s < 10 && s != 0) {
            System.out.println("однозначное не четное число");
        } else if (s >= 10 && s <100 && s % 2 == 0) {
            System.out.println("двузначное четное число");
        } else if (s >= 10 && s <100 && s % 2 != 0) {
            System.out.println("двузначное не четное число");
        } else if (s >= 100 && s <= 999 && s % 2 == 0) {
            System.out.println("трехзначное четное число");
        } else if (s >= 100 && s <= 999 && s % 2 != 0) {
            System.out.println("трехзначное не четное число");
        } else {
            System.out.println("введите число от нуля до 999");
        }
    }
}
