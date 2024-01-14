import java.io.*;

public class report {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        
        System.out.println(sum);
    }
}
