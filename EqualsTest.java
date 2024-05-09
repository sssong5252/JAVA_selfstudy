public class EqualsTest {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "You were born to be loved."; // 여기서 사용된 따옴표를 수정했습니다.
        str2 = str1;
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2)); // str1과 str2가 같은 객체를 참조하는지 확인합니다. 결과는 true입니다.
        str2 = new String(str1); // str2에 str1의 값을 가지는 새로운 String 객체를 할당합니다.
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2)); // str1과 str2가 같은 객체를 참조하는지 확인합니다. 결과는 false입니다.
        System.out.println("Same value? " + str1.equals(str2)); // str1과 str2의 값이 같은지 확인합니다. 결과는 true입니다.
    }
}
