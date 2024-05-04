package ch_1_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть строку: ");
        Scanner scanner = new Scanner(System.in);
        String line;
        try {
            line = scanner.next("\\w*");
            scanner.close();
        } catch (NoSuchElementException | IllegalArgumentException e) {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Unknown error");
            throw e;
        }

        try (FileWriter fileWriter = new FileWriter("info.txt", true)) {
            fileWriter.append(line).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
