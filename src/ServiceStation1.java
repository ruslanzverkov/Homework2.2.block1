public class ServiceStation1 {



    public void check(String allName) {
        System.out.println("Обслуживаем " + allName);
    }
    public void check(int allTyre) {
        if (allTyre != 0) {
            for (int i = 0; i < allTyre; i++) {
                truck.updateTyre();
            }
        }
    }

    public void check(AllCar allCar) {

        if (AllCa!=null) {
            car.checkEngine();
        } else if (truck != null) {
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

}
