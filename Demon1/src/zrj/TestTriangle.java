package zrj;
import zrj.Triangle2D;
import zrj.Point2D;
public class TestTriangle {
public static void main(String[] args){
	Triangle2D t=new Triangle2D();
	Point2D p=new Point2D(1,0);
	System.out.println(t.contains(p));
}
}
