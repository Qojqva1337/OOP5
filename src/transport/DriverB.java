package transport;

public class DriverB extends Driver{

    public DriverB(String name, boolean hasDriverLicense, int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категорий Б " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категорий Б " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категорий Б " + getName() + " запрвляет авто");
    }
}
