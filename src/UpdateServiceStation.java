public class UpdateServiceStation {


    public void check(Bicycle bicycle) {
    }
    public void check(Car car) {
        if (car != null) {
            car.checkEngine();
        }
    }
    public void check(Truck truck) {
        if (truck != null) {
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    public void check(int allWheelsCount) {
        if (allWheelsCount != 0) {
            for (int i = 0; i < allWheelsCount; i++) {
                System.out.println("Меняем покрышку");
            }
        }
    }




}
