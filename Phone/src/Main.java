public class Main {
    public static void main(String[] args) {
        Phone tel1 = new Phone(123, "sams 10", 305);
        Phone tel2 = new Phone(456, "sams 9", 293);
        Phone tel3 = new Phone(789, "sams 8", 289);

        System.out.println(tel1.number + ", " + tel1.model + ", " + tel1.weight);
        System.out.println(tel2.number + ", " + tel2.model + ", " + tel2.weight);
        System.out.println(tel3.number + ", " + tel3.model + ", " + tel3.weight);
        System.out.println();

        tel1.receiveCall("Сергей");
        tel2.receiveCall("Елена");
        tel3.receiveCall("Максим");
        System.out.println();

        System.out.println(tel1.getNumber());
        System.out.println(tel2.getNumber());
        System.out.println(tel3.getNumber());

        tel1.getNumber();
        tel2.getNumber();
        tel3.getNumber();
        /*тут я не понял, почему этот метод так не вызывается.
        receiveCall так можно вызвать, а getNumber нет?
         */

        tel1.receiveCall("Сергей", 123);
        tel2.receiveCall("Елена", 456);
        tel3.receiveCall("Максим", 789);
        System.out.println();

        Phone.sendMessage(tel1.getNumber(), tel2.getNumber(), tel3.getNumber());

    }
}
