import java.io. *;
public class assignment
{
    public static void main(String[] args) throws IOException
    {
        int num;
        num = 1234;
        System.out.println("num은 " + num + "입니다");

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);
    }
}
