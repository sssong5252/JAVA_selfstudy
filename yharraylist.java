import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class yharraylist {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("사람의 정보를 입력하세요.");
            System.out.println("이름, 나이, 성별을 순서대로 입력하세요.");
            System.out.println("입력을 종료하려면 '0'을 입력하세요.");

            while (true) {
                System.out.print("이름: ");
                String name = reader.readLine();

                if (name.equals("0")) {
                    break;
                }

                System.out.print("나이: ");
                int age = Integer.parseInt(reader.readLine());

                System.out.print("성별: ");
                String gender = reader.readLine();

                Person person = new Person(name, age, gender);
                personList.add(person);
            }

            System.out.println("입력한 사람들의 정보:");

            for (int i = 0; i < personList.size(); i++) {
                Person person = personList.get(i);
                System.out.println("번호: " + (i + 1));
                System.out.println("이름: " + person.getName());
                System.out.println("나이: " + person.getAge());
                System.out.println("성별: " + person.getGender());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}