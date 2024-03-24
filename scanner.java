// import java.util.*;

// public class scanner {

//     public static void swap(int[] arr) {
//         int tmp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = tmp;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a, b;
//         System.out.println("두 정수를 입력하세요: ");
//         a = scanner.nextInt();
//         b = scanner.nextInt();

//         System.out.println("스왑 전: a = " + a + ", b = " + b);
        
//         int[] arr = {a, b};
//         swap(arr);
        
//         a = arr[0];
//         b = arr[1];

//         System.out.println("스왑 후: a = " + a + ", b = " + b);
//     }
// }
import java.util.*;

public class scanner {

    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("두 정수를 입력하세요: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("스왑 전: a = " + a + ", b = " + b);
        
        int[] arr = {a, b};
        swap(arr);
        
        a = arr[0];
        b = arr[1];

        System.out.println("스왑 후: a = " + a + ", b = " + b);
    }
}
