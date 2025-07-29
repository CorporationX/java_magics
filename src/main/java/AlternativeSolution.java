import java.util.Arrays;

public class AlternativeSolution {
    public static void main(String[] args) {
        // Зелье варится, делаем 5 замеров температуры, считаем среднюю температуру, делаем проверку на
        // перекипело или нет

        double[] temperatures = {60.1, 90.2, 79.5, 82.7, 80.00};

        double average = Arrays.stream(temperatures).average().getAsDouble();
        String answer = (average > 80) ? "Перекипело!" : "Все ок";
        System.out.println(answer);
    }
}
