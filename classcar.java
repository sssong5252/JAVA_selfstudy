import java.io.*;
import java.util.ArrayList; //가변적 배열

class Car {
    int num;
    String name;
    double gas;
    void show() {
        System.out.println("차량의 번호는 " + this.num); //this.은 본인을 뜻한다
        System.out.println("남은 연료의 양은 " + this.gas);
    }
    void info() {
        System.out.println("정보를 표시합니다.");
        this.show(); //위에서 생성한 show를 실행한다. 그럼 당연히 코드에서는 위 기능을 담은 info를 써야겠지??
    }
}

public class classcar {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Car> carList = new ArrayList<>(); //타입 생략 가능. ArrayList 생성

        Car car1 = new Car();
        car1.num = 1023;
        car1.name = "sonata";
        car1.gas = 20.3;
        carList.add(car1);

        Car car2 = new Car();
        car2.num = 3029;
        car2.name = "Benz";
        car2.gas = 30.9;
        carList.add(car2);

        System.out.println("생성된 차량의 이름 목록:");
        for (Car car : carList) {
            System.out.println(car.name); //ArrayList에 car.name을 넣고 이를 출력한다
        }

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

            carList.add(newCar);

            System.out.println("생성된 차량의 이름 목록:");
            for (Car car : carList) {
                System.out.println(car.name); //위와 동일
            }
        }
    }
}
