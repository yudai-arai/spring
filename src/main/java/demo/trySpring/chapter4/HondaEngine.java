package demo.trySpring.chapter4;

public class HondaEngine implements Engine {
    public HondaEngine() {
        super();
    }

    @Override
    public void boot() {
        System.out.println("ホンダエンジン起動");
    }

    @Override
    public void stop() {
        System.out.println("ホンダエンジン停止");
    }
}
