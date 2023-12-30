import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("B를 입력하세요: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        System.out.println("덧셈 결과: " + sum);
        System.out.println("뺄셈 결과: " + difference);
        System.out.println("곱셈 결과: " + product);
        System.out.println("나눗셈 결과: " + quotient);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
