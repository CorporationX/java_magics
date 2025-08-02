public class NumbersAnalyzer {
    public static void main(String[] args) {
        int[] num  = {13,2,34,4,35};

        int min = num[0];
        int max = num[0];
        // всё что ниже мне предложил исправить IJ
        for (int number : num) { //эту строку я понял только от части что значит ": num"?
            if (number < min) min = number;

            if (number > max) max = number;
        }

        //а тут я сам догадался прописать одной строчкой
        System.out.println("Максимальное число - " + max + "\nМинимальное число - " + min);
    }
}
