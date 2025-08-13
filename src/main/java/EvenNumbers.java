public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;// Переменная, которая будет хранить сумму чисел

        // Цикл от 222 до 444
        for ( int i = 222; i<= 444; i++ ) {
            if (i % 2 == 0) { // Проверка на четность числа
                System.out.println("Число чётное!");
                sum += i; // Прибавляем число к сумме
            }
        }
        // Результат
        System.out.println("Сумма чётных чисел: " + sum);
    }

}
