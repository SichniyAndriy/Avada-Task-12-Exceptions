package ch_3.unchecked;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ділення на нуль");
        }

    }
}
