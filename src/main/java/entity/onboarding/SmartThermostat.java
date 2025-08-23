package entity.onboarding;

public class SmartThermostat extends IoTDevice{
        private double temperature;

    public SmartThermostat(String id, String name) {
        super(id, name);
        this.temperature = 45.7;
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("temperature: " + temperature);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
