package entity.onboarding;

public class IoTSystem {
    static void main() {
        IoTDevice device1 = new SmartLight("01", "Светильник 1", false);
        IoTDevice device2 = new SmartThermostat("02", "Термостат 1");

        device1.performAction();
        device2.performAction();

        ((SmartThermostat) device2).setTemperature(67.3);
        device2.performAction();
    }
}
