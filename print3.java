import java.util.Scanner;

public class print3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int i = 1;
        while (i <= num) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
