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

            ServiceStation station = new ServiceStation();
            station.check(car, null, null);
            station.check(car2, null, null);
            station.check(null, bicycle, null);
            station.check(null, bicycle2, null);
            station.check(null, null, truck);
            station.check(null, null, truck2);

            ServiceStation1 station1=new ServiceStation1();
            station1.check("car1");
            station1.check(4);
            station1.check(car);
            station1.check("car2");
            station1.check(4);
            station1.check(car2);
            station1.check("truck1");
            station1.check(6);
            station1.check(truck);
            station1.check("truck2");
            station1.check(8);
            station1.check(truck2);



        }



}