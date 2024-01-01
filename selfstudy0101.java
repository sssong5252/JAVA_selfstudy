import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selfstudy0101 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int num = Integer.parseInt(str1);

        double[] double_list = new double[num];

        for(int i = 0; i < num; i++)
        {
            String str2 = br.readLine();
            double input_value = Double.parseDouble(str2);
        }
        
    }
}
