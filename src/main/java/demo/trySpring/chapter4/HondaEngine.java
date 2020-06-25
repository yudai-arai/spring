package demo.trySpring.chapter4;

public class HondaEngine implements Engine {
    public HondaEngine() {
        super();
    }

    public void boot() {
        System.out.println("ホンダエンジン起動");
    }

    public void stop() {
        System.out.println("ホンダエンジン停止");
    }
}
