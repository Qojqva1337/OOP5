import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver number" + i, true, i + 5);
            DriverC driverC = new DriverC("Driver number" + i, true, i + 7);
            DriverD driverD = new DriverD("Driver number" + i, true, i + 10);
            Bus bus = new Bus("Bus brand №" + i, "Bus brand №" + i, 4.0, driverD, Capacity.LARGE);
            Car car = new Car("Car brand №" + i, "Car brand №" + i, 4.5, driverB, TypeOfBody.SEDAN);
            Truck truck = new Truck("Truck brand №" + i, "Truck brand №" + i, 4.1, driverC, Weight.N1);
            printlnfo(car);
            printlnfo(bus);
            printlnfo(truck);


        }

    }

    private static void printlnfo(Transport<?> transport) {
        System.out.println("Водитель " +transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде ");
        transport.printType();
    }



}


