package demo.trySpring.chapter4;

public class HondaEngineVer2 extends HondaEngine {
    public HondaEngineVer2() {
        super();
    }

    @Override
    public void boot() {
        System.out.println("ホンダエンジン起動（Ver2）");
    }

    @Override
    public void stop() {
        System.out.println("ホンダエンジン停止（Ver2）");
    }
}
