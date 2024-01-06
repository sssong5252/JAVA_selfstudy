import java.io.*;
import java.util.*;

public class arraytest {
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        ArrayList<array_list> array_list = new ArrayList<>();
        // char[] hello = new char[5];
        // hello[0] = 'h';
        // hello[1] = 'e';
        // hello[2] = 'l';
        // hello[3] = 'l';
        // hello[4] = 'o';

        // System.out.println(hello[0]);

        // for(int i = 0; i <10; i++)
        // {
        //     System.out.println("i는" + i + "이고, 배열은" + hello[i] + "입니다");
        // }
        String[] str = new String[5];
        str[0] = "hello";
        str[1] = "my";
        str[2] = "name";
        str[3] = "is";
        str[4] = "junyong";

        String str1 = br.readLine();
        int num = Integer.parseInt(str1);

        double [] array_new = new double[num];
        for(int i = 0; i < num; i++)
        {
            String num2 = br.readLine();
            int num3 = Integer.parseInt(num2);

            array_new[i] = num3;
        }
        for

        System.out.println(str[0] + str[1]);
    }
}
