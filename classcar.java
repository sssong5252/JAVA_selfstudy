import java.io. *;
class Car {
    int num;
    String name;
    double gas;
    void show() {
        System.out.println("차량의 번호는" + num );
        System.out.println("남은 연료의 양은" + gas);
    }
}

public class classcar {
    public static void main(String[] args)throws IOException
    { 
        Car car1;
        car1 = new Car();

        Car car2;
        car2 = new Car();

        
        car1.num = 1023;
        car1.name = "sonata";
        car1.gas = 20.3;
        car1.show();
        
        car2.num = 3029;
        car2.name = "Benz";
        car2.gas = 30.9;
        car2.show();


        System.out.println(car1.name);
    }
}
