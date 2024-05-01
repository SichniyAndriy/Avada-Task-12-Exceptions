package ch_3.error;

import java.time.LocalDateTime;
import java.util.ArrayList;
import net.datafaker.Faker;

public class OutOfMemory {
    private static Faker faker = new Faker();

    public static void main(String[] args) {
        ArrayList<SomeBigClass> arrayList = new ArrayList<>();
        try {
            while (true) {
                arrayList.add(new SomeBigClass());
            }
        } catch (OutOfMemoryError error) {
           error.printStackTrace();
        }
    }

    static class SomeBigClass {
        long x1 = faker.random().nextLong();
        long x2 = faker.random().nextLong();
        long x3 = faker.random().nextLong();
        long x4 = faker.random().nextLong();
        long x5 = faker.random().nextLong();
        long x6 = faker.random().nextLong();
        long x7 = faker.random().nextLong();
        long x8 = faker.random().nextLong();
        long x9 = faker.random().nextLong();
        long x10 = faker.random().nextLong();
        String line1 = faker.lorem().characters(10240, true);
        String line2 = faker.lorem().characters(10240, true);
        String line3 = faker.lorem().characters(10240, true);
        String line4 = faker.lorem().characters(10240, true);
        String line5 = faker.lorem().characters(10240, true);
        String line6 = faker.lorem().characters(10240, true);
        String line7 = faker.lorem().characters(10240, true);
        String line8 = faker.lorem().characters(10240, true);
        String line9 = faker.lorem().characters(10240, true);
        String line10 = faker.lorem().characters(10240, true);
        LocalDateTime localDateTime = LocalDateTime.now();
    }
}
