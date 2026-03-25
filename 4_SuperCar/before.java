class SuperCar {
    final static String PORSCHE = "Porsche";
    final static String FERRARI = "Ferrari";
    final static String AVANTEN = "AvanteN";
    String carName;
    public SuperCar(String carName) { this.carName = carName; }
    void ride() {
        if (carName.equals(PORSCHE)) System.out.println("Porsche");
        if (carName.equals(FERRARI)) System.out.println("Ferrari");
        if (carName.equals(AVANTEN)) System.out.println("AvanteN");
    }
}