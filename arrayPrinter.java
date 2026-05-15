public class arrayPrinter {

    public static void printNeatly(int[] array) {
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            System.out.print(number + ",");
            index = index + 1;
        }
    }

    void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);

    }

}
