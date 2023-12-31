import java.io.*;
class Car {
    int num;
    String name;
    double gas;
    void show() {
        System.out.println("차량의 번호는 " + this.num);
        System.out.println("남은 연료의 양은 " + this.gas);
    }
    void info() {
        System.out.println("정보를 표시합니다.");
        this.show();
    }
}

public class classcar {
    public static void main(String[] args) throws IOException
    {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

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

        while (true) {
            System.out.println("차량 이름을 입력하세요 (0을 입력하면 종료): ");
            String carName = br.readLine();
            if (carName.equals("0")) {
                break;
            }

            Car newCar = new Car();
            newCar.name = carName;

            System.out.print("차량 번호를 입력하세요: ");
            String numStr = br.readLine();
            newCar.num = Integer.parseInt(numStr);

            System.out.print("차량 연료 양을 입력하세요: ");
            String gasStr = br.readLine();
            newCar.gas = Double.parseDouble(gasStr);

            newCar.show();
        }
    }
}
