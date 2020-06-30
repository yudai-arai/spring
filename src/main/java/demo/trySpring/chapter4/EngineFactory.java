package demo.trySpring.chapter4;

public class EngineFactory {
    public static Engine createHondaEngine() {
        return new HondaEngineVer2();
    }

    public static Engine createNissanEngine() {
        return new NissanEngine();
    }
}
