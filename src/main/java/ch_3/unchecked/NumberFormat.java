package ch_3.unchecked;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Неможливо перетворити строку в число");
        }
    }
}
