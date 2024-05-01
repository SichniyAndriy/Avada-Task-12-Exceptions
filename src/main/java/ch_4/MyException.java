package ch_4;

public class MyException {
    public static void main(String[] args) {
        class SmallAgeException extends Exception {
            public SmallAgeException(String message) {
                super(message);
            }
        }

        int number = 15;
        try {
            if (number < 18) {
                throw new SmallAgeException("Неповнолітній на сайті");
            }
        } catch (SmallAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
