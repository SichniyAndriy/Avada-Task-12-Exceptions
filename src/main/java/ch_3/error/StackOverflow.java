package ch_3.error;

// StackOverflow
public class StackOverflow {
    public static void main(String[] args) {
        try {
            fact(Integer.MAX_VALUE);
        } catch (StackOverflowError error) {
           error.printStackTrace();
        }
    }

    public static int fact(int x) {
        return x * fact(x - 1);
    }
}
