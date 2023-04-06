package transport;
    public class Bus extends Transport<DriverD> {

        private Capacity capacity;
        public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
            super(brand, model, engineVolume, driver);
            this.capacity = capacity;
        }

        public Capacity getCapacity() {
            return capacity;
        }

        public void setCapacity(Capacity capacity) {
            this.capacity = capacity;
        }

        @Override
        public void startMove() {
            System.out.println(" Автобус марки " + getBrand() + " начал движение");
        }

        @Override
        public void finishMove() {
            System.out.println(" Автобус марки " + getBrand() + " закончил движение");
        }

        @Override
        public void printType() {
            if (capacity==null) {
                System.out.println("Данных по авто недостаточно");
            } else {

                System.out.println("Совместимость автобуса: от " + capacity.getFrom() + "до " + capacity.getTo());
            }
        }

        @Override
        public boolean diagnostics() throws DiagnosticFailedException {
            return false;
        }


        @Override
        public void pitStop() {
            System.out.println("Пит стоп у автобуса");
        }

        @Override
        public void theBestCircleTime() {
            int minBound = 100;
            int maxBound = 150;
            int theBestTimeMIns = (int) (minBound+ (maxBound - minBound)*Math.random());
            System.out.println("Лучшее время круга для автобуса в минутах " + theBestTimeMIns);
        }

        @Override
        public void maxSpeed() {
            int minBound = 100;
            int maxBound = 150;
            int maxSpeed = (int) (minBound+ (maxBound - minBound)*Math.random());
            System.out.println("Максимальная скорость для автобуса " + maxSpeed);
        }



        @Override
        public String getBrand() {
            return super.getBrand();
        }
    }

