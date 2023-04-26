public class Car extends Vehicle implements EngineMotive{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
