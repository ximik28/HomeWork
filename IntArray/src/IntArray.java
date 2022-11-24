public class IntArray {
    private int[] myarray;

    IntArray(int K) {
        this.myarray = new int[K];
    }

    IntArray(int[] myarray) {
        this.myarray = myarray;
    }

    IntArray() {
        this.myarray = new int[15];
    }

    public void sort (int N) {
        if (N < 0 && N != 0) {
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray.length - i -1; j++) {
                    if (myarray[j] < myarray[j + 1]) {
                        int temp = myarray[j];
                        myarray[j] = myarray[j + 1];
                        myarray[j + 1] = temp;
                    }
                }
            }
        } else if (N > 0 && N != 0) {
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray.length - i - 1; j++) {
                    if (myarray[j] > myarray[j + 1]) {
                        int temp = myarray[j];
                        myarray[j] = myarray[j + 1];
                        myarray[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
    }

    public int[] getMyarray() {
        return myarray;
    }

    public void setMyarray(int[] myarray) {
        this.myarray = myarray;
    }

    public int getMyarrayLength () {
        return myarray.length;
    }

    public void setMyarray(int b,int i) {
        this.myarray[i] = b;
    }
}
