public class Car extends AllTransport{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }
    @Override
    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку машины");
        }
    }
    @Override
    public void transportService() {
        System.out.println("Обслуживаем "+this.getModelName());
        updateTyre();
        checkEngine();
    }
}
