import java.io. *;
public class assignment
{
    public static void main(String[] args) throws IOException
    {
        int numb;
        numb = 1234;
        System.out.println("num은 " + numb + "입니다");

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println(str);
        System.out.println("입력받은" + str + "을 정수형" + num + "으로 변환하였습니다");

    }
}
