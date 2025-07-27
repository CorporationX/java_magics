

public class NumbersAnalyzer {
    public static void main(String[] args) {
        int[] chislo = {4 , 7 , 11 , 14 , 3};
        int min = chislo[0];
        int max = chislo[0];
        for (int i = 0; i < chislo.length; i++) {
            if (chislo[i] < min){
                min = chislo[i];
            }
            if (chislo[i] > max){
                max = chislo[i];
            }
        }
        System.out.println("min число: " + min);
        System.out.println("max число: " + max);
    }
}