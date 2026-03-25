class Truck {
    private int speed;
    public void move() { speed++; }
    public void pickUp(){ System.out.println("짐 옮기기"); }
    public void stop() { speed = 0; }
}
class ElectricCar {
    private int speed;
    public void moving() { speed++; }
    public void charge() { System.out.println("charging"); }
    public void stop(){ speed = 0; }
}
