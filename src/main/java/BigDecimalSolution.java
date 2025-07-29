public class BigDecimalSolution {
    public static void main(String[] args) {
        // Зелье варится, делаем 5 замеров температуры, считаем среднюю температуру, делаем проверку на
        // перекипело или нет

        // TODO домашнее задание - перевести все double в BigDecimal
        double[] temperatures = {0.1f, 0.2f};

        double sum = 0;
        for (double temperature : temperatures) {
            sum = sum + temperature;
        }
        System.out.println("Сумма: " + sum);

        double average = sum / temperatures.length;

        System.out.println("Среднее число: " + average); // Not a number

        if (average > 80) {
            System.out.println("Перекипело!");
        } else {
            System.out.println("Все ок");
        }
    }
}
