package ch_3.error;

public class NoClassDef {
    public static void main(String[] args) {
        Test test = new Test();
        int x = 9;
        int y = 0;
        try {
            test.method();
        } catch (NoClassDefFoundError error) {
            error.printStackTrace();
        }
    }
}
