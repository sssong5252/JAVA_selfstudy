import java.io.*;
import java.util.Arrays;
public class arraytest2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int A = Integer.parseInt(str1);

        double[] B = new double[A];

        for(int i = 0; i < A; i++)
        {
            String str2 = br.readLine();
            double C = Double.parseDouble(str2);
            B[i] = C;
        }
        System.out.println(Arrays.toString(B)); //배열을 문자열로 취급해서 흔히 아는 형태로 출력하기
    }
}
