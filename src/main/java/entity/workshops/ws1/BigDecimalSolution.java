package entity.workshops.ws1;

import java.math.BigDecimal;

public class BigDecimalSolution {
    public static void main(String[] args) {
        // Зелье варится, делаем 5 замеров температуры, считаем среднюю температуру, делаем проверку на
        // перекипело или нет

        //  TODO домашнее задание - перевести все double в BigDecimal

        BigDecimal[] temperatures = {
                new BigDecimal("82.3"),
                new BigDecimal("71.8"),
                new BigDecimal("83.7"),
                new BigDecimal("82.5"),
                new BigDecimal("78.8"),};
//                new BigDecimal(".1"),   //  test
//                new BigDecimal(".2")};  //  test

        BigDecimal sum = new BigDecimal(0);

        for (BigDecimal temperature : temperatures) {
            sum = temperature.add(sum);
        }

        System.out.println("Сумма: " + sum);

        BigDecimal average = sum.divide(BigDecimal.valueOf(temperatures.length));

        System.out.println("Среднее число: " + average);

        String output = average.doubleValue() > 80 ? "Перекипело!" : "Все ок";
        System.out.println(output);
    }
}
