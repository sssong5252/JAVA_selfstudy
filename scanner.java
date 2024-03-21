import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        float num2, sum;
        String str1;
        str1 = scanner.nextLine();
        num1 = scanner.nextInt();
        num2 = scanner.nextFloat();

        sum = num1 + num2;
        System.out.println(str1);
        System.out.println(sum);
    } 
}
