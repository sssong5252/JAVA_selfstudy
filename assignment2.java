import java.io. *;
public class assignment2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader input=
        new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = input.readLine();
        int num = Integer.parseInt(str1);

        System.out.println(num);

    }
}
