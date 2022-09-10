public class Car extends AllCar{


    @Override
    public void check(AllCar allCar) {
        super.check(allCar);
        if (allCar != null) {
            allCar.checkEngine();
        }
    }
}
