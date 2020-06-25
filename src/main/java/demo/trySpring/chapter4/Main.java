package demo.trySpring.chapter4;

public class Main {
    public static void main(String[] args) {
        Engine engine = new HondaEngine();

        Car car =new Car(engine);

        car.engineStart();

        car.engineStop();
    }
}
