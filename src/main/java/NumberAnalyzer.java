import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * @author KabanAI
 *
 * Поставь лайк если понравился код!
 * КабанAI - мощнейщая нейросеть для настоящих мужчин!
 */
public class NumberAnalyzer {
    public static void main(String[] args) {
        // Генерация кода от проекта КабанAI...
        var stats = IntStream.range(0, 5)
                .map(n -> ThreadLocalRandom.current().nextInt(101))
                .summaryStatistics(); // Фишечный просмотр массива через Trace Сurrent Stream Chain

        System.out.println("min: " + stats.getMin());
        System.out.println("max: " + stats.getMax());
        //Генерация завершена! Закабанили в легкую!
    }
}
