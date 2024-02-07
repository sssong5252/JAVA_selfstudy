import java.util.Scanner;
public class threemul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int input = scanner.nextInt();

        int number = 1;
        
        while (number <= input) {
            if (number % 3 == 0) {
                number++;
                continue; // 3의 배수인 경우 다음 반복으로 건너뜁니다.
            }

            System.out.print(number + " ");
            number++;
        }
    }
}