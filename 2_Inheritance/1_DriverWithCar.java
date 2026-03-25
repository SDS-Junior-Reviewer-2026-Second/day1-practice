// Parent
class Car {
    int speed;
    public void move(){
        speed += 1;
    }
    public void stop(){
        speed = 0;
    }
}

class Driver {
    public void drivingCar(){
        Car car = new Car();
        car.move();
        car.stop();
    }
}
