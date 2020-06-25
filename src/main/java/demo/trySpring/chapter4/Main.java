package demo.trySpring.chapter4;

public class Main {
    public static void main(String[] args) {
        Engine engine = new NissanEngine();

        Car car =new Car(engine);

        car.engineStart();

        car.engineStop();
    }
}
