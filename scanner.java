// // import java.util.*;

// // public class scanner {

// //     public static void swap(int[] arr) {
// //         int tmp = arr[0];
// //         arr[0] = arr[1];
// //         arr[1] = tmp;
// //     }

// //     public static void main(String[] args) {
// //         scanner = new scanner(System.in);
// //         int a, b;
// //         System.out.println("두 정수를 입력하세요: ");
// //         a = scanner.nextInt();
// //         b = scanner.nextInt();

// //         System.out.println("스왑 전: a = " + a + ", b = " + b);
        
// //         int[] arr = {a, b};
// //         swap(arr);
        
// //         a = arr[0];
// //         b = arr[1];

// //         System.out.println("스왑 후: a = " + a + ", b = " + b);
// //     }
// // }
// import java.util.*;

// public class scanner {

//     public static void swap(int[] arr) {
//         int tmp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = tmp;
//     }

//     public static void main(String[] args) {
//         scanner = new scanner(System.in);
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
public class scanner{
    int value;
    
    public static void main(String[] args){
        
        scanner m1 = new scanner(10);
        scanner m2 = new scanner(20);
        
        System.out.println(m1.value + " " + m2.value);
        
        swap2(m1,m2);
        
        System.out.println(m1.value + " " + m2.value);
        
    }
    
    public scanner(int a) {
        this.value = a;
    }
    
    private static void swap2(scanner a, scanner b) {
        int temp;
        temp = a.value;
        a.value = b.value;
        b.value = temp;
        
    }
}