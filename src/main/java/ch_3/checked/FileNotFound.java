package ch_3.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("неіснуюючий файл.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Помилка: Файл не знайдено!");
        }
    }
}
