package transport;

public class Truck extends Transport <DriverC> {

    private Weight weight;
    public Truck(String brand, String model, double engineVolume, DriverC driver, Weight weight) {
        super(brand, model, engineVolume, driver);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
    public void printType() {
        if (weight==null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + " ";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean diagnostics() throws DiagnosticFailedException {
        if (getDriver() != null && getDriver().isHasDriverLicense()) {
                return true;
            } else {
                throw new DiagnosticFailedException();
            }
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
