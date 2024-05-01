package ch_3.unchecked;

public class OutOfBounds {
    public static void main(String[] args) {
        try {
            int[] myArray = new int[3];
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Індекс за межами розміру масива");
        }
    }
}
