package demo.trySpring.chapter4;

public class NissanEngine implements Engine {
    public  NissanEngine() {
        super();
    }

    @Override
    public void boot() {
        System.out.println("日産エンジン起動");
    }

    @Override
    public void stop() {
        System.out.println("日産エンジン停止");
    }
}
