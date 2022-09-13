public class Bicycle extends AllTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку велосипеда");
        }
    }
    @Override
    public void transportService() {
        System.out.println("Обслуживаем "+this.getModelName());
        updateTyre();
    }
}
