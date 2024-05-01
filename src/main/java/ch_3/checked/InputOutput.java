package ch_3.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Помилка при читанні файла");
        }

    }
}
