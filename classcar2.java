import java.io.*;
import java.util.*;

class Car {
    String name;
    int price;

    void displayInfo() {
        System.out.println("차종: " + name);
        System.out.println("가격: " + price);
    }
}

class SportsCar extends Car {
    String brand;

    void displayInfo() {
        super.displayInfo();
        System.out.println("브랜드: " + brand);
    }
}

public class classcar2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> carList = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("생성할 차량의 종류를 선택하세요 (1. 일반차 / 2. 스포츠카 / 0. 종료): ");
            String choice = input.readLine();

            if (choice.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Car car;

            if (choice.equals("1")) {
                car = new Car();
                System.out.print("차량의 이름을 입력하세요: ");
                car.name = input.readLine();
                System.out.print("차량의 가격을 입력하세요: ");
                String priceStr = input.readLine();
                car.price = Integer.parseInt(priceStr);
            } else if (choice.equals("2")) {
                SportsCar sportsCar = new SportsCar();
                System.out.print("스포츠카의 이름을 입력하세요: ");
                sportsCar.name = input.readLine();
                System.out.print("스포츠카의 가격을 입력하세요: ");
                String priceStr = input.readLine();
                sportsCar.price = Integer.parseInt(priceStr);
                System.out.print("스포츠카의 브랜드를 입력하세요: ");
                sportsCar.brand = input.readLine();
                car = sportsCar;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                continue;
            }

            carList.add(car);

            System.out.println("===== 등록된 차량 목록 =====");
            for (Car c : carList) {
                c.displayInfo();
                System.out.println("------------------------");
            }
        }
    }
}
