package transport;

public class Truck extends Transport <DriverC> {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println(" Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(" Грузовик марки " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 60;
        int maxBound = 100;
        int theBestTimeMIns = (int) (minBound+ (maxBound - minBound)*Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + theBestTimeMIns);
    }

    @Override
    public void maxSpeed() {
        int minBound = 70;
        int maxBound = 100;
        int maxSpeed = (int) (minBound+ (maxBound - minBound)*Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);
    }
}
