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
        // 히터 ID와 명령을 조합해 출력 (세부사항)
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

        // 클라이언트는 히터의 내부 구현을 쥌 필요 없이
        // 함수 인터페이스로만 상호 작용
        heater.turnOn();
        System.out.println("Heater running...: " + heater.isRunning());

        heater.turnOff();
        System.out.println("Heater running: " + heater.isRunning());
    }
}