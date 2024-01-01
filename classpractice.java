import java.io.*;
import java.util.ArrayList;

class Info {
    int age;
    String name;
}

public class classpractice {
    public static void main(String[] args) throws IOException {
        ArrayList<Info> nameList = new ArrayList<>();
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));
        
        Info person1 = new Info();
        person1.age = 21;
        person1.name = "junyong";
        nameList.add(person1);

        while (true) {
            System.out.print("객체의 name을 입력하세요: ");
            String inputName = input.readLine();

            if (inputName.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Info newPerson = new Info();
            newPerson.name = inputName;

            System.out.print("객체의 age을 입력하세요: ");
            String inputAgeStr = input.readLine();
            int inputAge = Integer.parseInt(inputAgeStr);
            
            newPerson.age = inputAge;

            nameList.add(newPerson);

            for (Info person : nameList) {
                System.out.println(person.name);
            }
        }
    }
}
