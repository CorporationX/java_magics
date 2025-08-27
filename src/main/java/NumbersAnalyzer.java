public class NumbersAnalyzer {
    public static void main(String[] args) {
        int[] numbers = {50, 30, 40, 20, 100};
        int min = numbers[0];
        int max = numbers[0];
        int i;

        for(i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("min: " + min + "; max:" + max);
    }
}
