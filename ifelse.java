import java.io. *;
public class ifelse {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num = Integer.parseInt(str);
        if(num == 3)
        {
            System.out.println("hello your input value is 3");
        }
        else
        {
            System.out.println("nothing went wrong. NO err");
        }
    }
}
