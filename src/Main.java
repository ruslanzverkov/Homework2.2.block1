public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        OldServiceStation station = new OldServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);

        UpdateServiceStation station1=new UpdateServiceStation();
        car.check();
        station1.check(car.getWheelsCount());
        station1.check(car);

        car2.check();
        station1.check(car2.getWheelsCount());
        station1.check(car2);

        truck.check();
        station1.check(truck.getWheelsCount());
        station1.check(truck);

        truck2.check();
        station1.check(truck2.getWheelsCount());
        station1.check(truck2);

        bicycle.check();
        station1.check(bicycle.getWheelsCount());
        station1.check(bicycle);

        bicycle2.check();
        station1.check(bicycle2.getWheelsCount());
        station1.check(bicycle2);

    }
}