import java.io.*;

class info
{
    int age;
    String name;
}
public class classpractice {
    public static void main(String[] args)throws IOException
    {
        BufferedReader input =
        new BufferedReader(new InputStreamReader(System.in));
        info person1 = new info();
        person1.age = 21;
        person1.name = "junyong";

        while(true)
        {
            System.out.print("객체의 name을 입력하세요: ");
            String input_name = input.readLine();
            
        }


    }
}
