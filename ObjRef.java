import java.awt.Point;
public class ObjRef{
public static void main(String[] args) {
    Point pt1,pt2;
    pt1 = new Point(100,150);
    pt2 = new Point(200,250);
    System.out.println("pt1 : " + pt1.x + "," + pt1.y);
    System.out.println("pt2 : " + pt2.x + "," + pt2.y);
    pt2 = pt1;
    System.out.println("pt1 : " + pt1.x + "," + pt1.y);
    System.out.println("pt2 : " + pt2.x + "," + pt2.y);
    pt1.x = 300;
    pt1.y = 350;
    System.out.println("pt1 : " + pt1.x + "," + pt1.y);
    System.out.println("pt2 : " + pt2.x + "," + pt2.y);
    }
}