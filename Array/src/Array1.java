public class Array1 {
    public static void main(String[] args) {
        int[] myArr1 = new int[4];
        int min = 4;
        int max = 99;
        for (int i = 0; i < myArr1.length; i++) {
            myArr1[i] = (int) (Math.random() * (max - min) + min) ;
            System.out.print(myArr1[i] + " ");
        }
        System.out.println();
        if(myArr1[0] < myArr1[1] && myArr1[1] < myArr1[2] && myArr1[2] < myArr1[3]) {
            System.out.println("Массив myArr1 является строго возрастающим");
        } else {
            System.out.println("Массив myArr1 не является строго возрастающим");
        }
    }
}
