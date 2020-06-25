package demo.trySpring.chapter4;

public class Main {
    public static void main(String[] args) {
        Engine hondaEngine1 = EngineFactory.createHondaEngine();
        Engine hondaEngine2 = EngineFactory.createHondaEngine();
        Engine nissanEngine1 = EngineFactory.createNissanEngine();

        Car car1 = new Car(hondaEngine1);
        Car car2 = new Car(hondaEngine2);
        Car car3 = new Car(nissanEngine1);
    }
}
