public class StringMethod {
    public static void main(String[] args) {
    int alength, blength;
    char achar, bchar;
    String mystr1 = new String("Java Powerful");
    String mystr2 = new String("Java Programming");
    String mystr3 = mystr1 + mystr2;
    
    alength = mystr1.length();
    blength = mystr2.length();
    achar = mystr1.charAt(5);
    bchar = mystr2.charAt(10);
    System.out.println("mystr1에 저장되어있는 "+mystr1+"의 문자길이는"+alength);
    System.out.println("mystr2에 저장되어있는 "+mystr2+"의 문자길이는"+blength);
    System.out.println("mystr1의 6번째 인덱스에 있는 문자는 " + achar);
    System.out.println("mystr2의 11번째 인덱스에 있는 문자는 " + bchar);
    System.out.println("mystr1의 저장된 문자를 대문자로 바꿈 : " +
    mystr1.toUpperCase());
    System.out.println("mystr2의 저장된 문자중 a를 A로 바꿈 : " +
    mystr2.replace('a', 'A'));
    } 
} 