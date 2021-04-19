package Single;

public class Single {
    //饿汉式
//    private static Single single = new Single();
    private volatile static Single single;
    private Single(){}
    public static Single getInstance(){
        if (single == null){
            synchronized (Single.class){
                if(single == null){
                    single = new Single();
                }
            }
        }
        return single;
    }
}
