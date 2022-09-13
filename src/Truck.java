public class  Truck extends AllTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }
        public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }

    @Override
    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку грузовика");
        }
    }
    @Override
    public void transportService() {
        System.out.println("Обслуживаем "+this.getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
