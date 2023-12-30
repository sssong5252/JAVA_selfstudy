public class arraytest {
    public static void main(String[] args) 
    {
        char[] hello = new char[5];
        hello[0] = 'h';
        hello[1] = 'e';
        hello[2] = 'l';
        hello[3] = 'l';
        hello[4] = 'o';

        System.out.println(hello[0]);

        for(int i = 0; i <10; i++)
        {
            System.out.println("i는" + i + "이고, 배열은" + hello[i] + "입니다");
        }

    }
}
