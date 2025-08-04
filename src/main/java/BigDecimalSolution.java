import java.math.BigDecimal;

public class BigDecimalSolution {
    public static void main(String[] args) {
        // Зелье варится, делаем 5 замеров температуры, считаем среднюю температуру, делаем проверку на
        // перекипело или нет

        // TODO домашнее задание - перевести все double в BigDecimal
        BigDecimal[] temperatures = {new BigDecimal("0.1"), new BigDecimal("0.2")};

        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal temperature : temperatures) {
            sum = sum.add(temperature);
        }
        System.out.println("Сумма: " + sum);

        BigDecimal average = sum.divide(new BigDecimal(temperatures.length));

        System.out.println("Среднее число: " + average); // Not a number

        if (average.doubleValue() > 80) {
            System.out.println("Перекипело!");
        } else {
            System.out.println("Все ок");
        }
    }
}
