import java.util.Scanner;

public class pat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("크기를 입력하세요: ");
        int size = scanner.nextInt();
        
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
