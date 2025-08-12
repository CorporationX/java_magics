public class MagicThermometer {
    private int temperature = 10;

    public int getTemperature() {
        return temperature;
    }
    
    public void increase(int value){
        temperature += value;
        if (temperature > 100){
            temperature = 100;
            System.out.println("Максимальная температура 100");
        }
    }
    public void decrease(int value){
        temperature -= value;
        if (temperature < 10){
            temperature = 10;
            System.out.println("Маинимальная температура 10");
        }
    }

    public static void main(String[] args) {
       
        MagicThermometer thermometer = new MagicThermometer();
        
        System.out.println(thermometer.getTemperature());

        thermometer.increase(70);

        System.out.println(thermometer.getTemperature());

        thermometer.decrease(90);

        System.out.println(thermometer.getTemperature());
    }
}