package Template;

public class Hummer2 extends HummerModel{
    @Override
    public void start() {
        System.out.println("悍马2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马2刹车");
    }

    @Override
    public void alarm() {
        System.out.println("悍马2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马2轰油");
    }
}
