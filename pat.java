import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("크기를 입력하세요: ");
        int size = Integer.parseInt(br.readLine());

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= Math.abs(size / 2 - i) + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= size - 2 * (Math.abs(size / 2 - i) + 1); j++) {
                System.out.print("＊");
            }

            System.out.println();
        }
    }
}
