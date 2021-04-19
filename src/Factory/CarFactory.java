package Factory;

public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("wuLing")){
            return new WuLing();
        }
        else if (car.equals("HongQi")){
            return new HongQi();
        }
        else{
            return null;
        }
    }
}
