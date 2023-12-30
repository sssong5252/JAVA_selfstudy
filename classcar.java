import java.io. *;
class Car {
    int num;
    String name;
}

public class classcar {
    public static void main(String[] args)throws IOException
    { 
        Car car1;
        car1 = new Car();
        
        car1.num = 1023;
        car1.name = "sonata";

        System.out.println(car1.name);
    }
}
