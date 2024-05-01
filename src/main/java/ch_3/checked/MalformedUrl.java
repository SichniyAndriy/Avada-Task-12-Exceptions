package ch_3.checked;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MalformedUrl {
    public static void main(String[] args) {
        try {
            URL url = new URL("mttp://неіснуючий сайт.com");
            URLConnection connection = url.openConnection();
        } catch (MalformedURLException e) {
            System.out.println("Невірний URL!");
        } catch (IOException e) {
            System.out.println("Помилка мережі");
        }
    }
}
