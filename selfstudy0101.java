import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class selfstudy0101 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("실수형 배열의 크기를 결정하는 정수를 입력하세요: ");
        String str1 = br.readLine();
        int num = Integer.parseInt(str1);

        double[] double_list = new double[num];

        for(int i = 0; i < num; i++)
        {
            System.out.print((i+1) + "번쨰 실수형 배열의 요소를 입력하세요: ");
            String str2 = br.readLine();
            double input_value = Double.parseDouble(str2);

            double_list[i] = input_value;
        }

        System.out.println(Arrays.toString(double_list));
        
    }
}
