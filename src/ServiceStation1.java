public class ServiceStation1 {

AllCar allCar=new AllCar() {
    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }
};

    public void check(String allName) {
        System.out.println("Обслуживаем " + allName);
    }

    public void check(int allCount) {
        if (allCount != 0) {
            for (int i = 0; i < allCount; i++) {
                allCar.updateTyre();
            }
        }
    }




}
