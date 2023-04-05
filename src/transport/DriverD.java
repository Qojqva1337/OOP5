package transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean hasDriverLicense, int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категорий D " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категорий D " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категорий D " + getName() + " запрвляет авто");
    }
}
