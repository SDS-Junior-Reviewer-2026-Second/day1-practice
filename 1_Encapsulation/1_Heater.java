class Heater {
    private boolean isOn = false;
    private int heaterId;

    public Heater(int id) {
        this.heaterId = id;
    }

    public void turnOn() {
        sendCommand("ON");
        isOn = true;
    }

    public void turnOff() {
        sendCommand("OFF");
        isOn = false;
    }

    private void sendCommand(String command) {
        System.out.println("Sending command to Heater "
                + heaterId +
                ": " + command
        );
    }

    public boolean isRunning() {
        return isOn;
    }
}

class GreenHouse {
    public static void main(String[] args) {
        Heater heater = new Heater(1);
        heater.turnOn();
        System.out.println("Heater running...: " + heater.isRunning());
        heater.turnOff();
        System.out.println("Heater running: " + heater.isRunning());
    }
}