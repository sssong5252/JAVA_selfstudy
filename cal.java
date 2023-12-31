// import java.util.Scanner;
import java.io.*;
public class cal {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("insert the operator: ");
            String operator = input.readLine();
           
            if (operator.equals("x")) 
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("insert 1st num: ");
            String a = input.readLine();
            int num1 = Integer.parseInt(a);
            System.out.print("insert 2nd num: ");
            String b = input.readLine();
            int num2 = Integer.parseInt(b);

            int plus = add(num1, num2);
            int differ = subtract(num1, num2);
            int mul = multiply(num1, num2);
            int div = divide(num1, num2);

            
            if (operator.equals("+")) 
            {
                System.out.println("result: " + plus);
                System.out.println("--------------------------------------");
            }

            else if (operator.equals("-"))
            {
                System.out.println("result: " + differ);
                System.out.println("--------------------------------------");
            }

            else if (operator.equals("*"))
            {
                System.out.println("result: " + mul);
                System.out.println("--------------------------------------");
            }

            else if (operator.equals("/"))
            {
                System.out.println("result: " + div);
                System.out.println("--------------------------------------");
            }
        }
    }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("A를 입력하세요: ");
    // int num1 = sc.nextInt();
    // System.out.print("B를 입력하세요: ");
    // int num2 = sc.nextInt();

    // int sum = add(num1, num2);
    // int difference = subtract(num1, num2);
    // int product = multiply(num1, num2);
    // double quotient = divide(num1, num2);

    // System.out.println("덧셈 결과: " + sum);
    // System.out.println("뺄셈 결과: " + difference);
    // System.out.println("곱셈 결과: " + product);
    // System.out.println("나눗셈 결과: " + quotient);
    // }

    // public static int add(int a, int b) {
    //     return a + b;
    // }

    // public static int subtract(int a, int b) {
    //     return a - b;
    // }

    // public static int multiply(int a, int b) {
    //     return a * b;
    // }

    // public static double divide(int a, int b) {
    //     return (double) a / b;

    // }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
