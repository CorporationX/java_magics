public class OriginalSolution {
    public static void main(String[] args) {
        // Зелье варится, делаем 5 замеров температуры, считаем среднюю температуру, делаем проверку на
        // перекипело или нет

        double[] temperatures = {};

        double sum = 0;
        for (double temperature : temperatures) {
            sum = sum + temperature;
        }

        if (temperatures.length == 0) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        double average = sum / temperatures.length;

        System.out.println("Среднее число: " + average); // Not a number

        if (average > 80) {
            System.out.println("Перекипело!");
        } else {
            System.out.println("Все ок");
        }
    }
}
