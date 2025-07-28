public class NumbersAnalyzer {
    public static void main(String[] args){
        int[] num = {1, 14, 7, 31, 53};
        int min = 100;
        int max = -100;
        for (int i = 0; i<num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Минимальное число: " + min + "\n" + "Максимальное число: " + max);
    }
}
