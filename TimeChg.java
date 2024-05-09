import java.util.*;

public class TimeChg {

     public static void main(String[] args) {

          int time;      //초 입력

          int hour, min, sec;   //시, 분, 초 계산시 사용

          Scanner s=new Scanner(System.in);

          System.out.print("## 계산할 초는 ? => ");
          time = s.nextInt;

          hour = time/3600;

          min = time / 60;
          time %= 60;

          sec = time;

          System.out.println(hour +  "시간, " + min + "분, " + sec + "초 이다.");
     }
}