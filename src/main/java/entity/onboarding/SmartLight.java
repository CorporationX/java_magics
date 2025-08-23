package entity.onboarding;

public class SmartLight extends IoTDevice {
    private boolean isOn; //для хранения состояния света (включен или выключен)

    public SmartLight(String id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }

    @Override
    public void performAction() {
        super.performAction();

        String message = isOn ? "On" : "Off";
        System.out.println("SmartLight performAction: " + message);
    }
}
