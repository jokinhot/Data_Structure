package zrj;
import zrj.Point2D;
import java.util.Scanner;
public class Triangle2D {
Point2D p1;
Point2D p2;
Point2D p3;
public Point2D getP1() {
	return p1;
}
public void setP1(Point2D p1) {
	this.p1 = p1;
}
public Point2D getP2() {
	return p2;
}
public void setP2(Point2D p2) {
	this.p2 = p2;
}
public Point2D getP3() {
	return p3;
}
public void setP3(Point2D p3) {
	this.p3 = p3;
}
/**
 * @param p1
 * @param p2
 * @param p3
 */
public Triangle2D() {
	super();
	this.p1 = new Point2D(0,0);
	this.p2 = new Point2D(1,1);
	this.p3 = new Point2D(2,5);
}
/**
 * @param p1
 * @param p2
 * @param p3
 */
public Triangle2D(Point2D p1, Point2D p2, Point2D p3) {
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}
public double getPerimeter(){
	double perimeter=0;
	perimeter=p1.distance(p2)+p1.distance(p3)+p2.distance(p3);
	return perimeter;
}
public double getArea(){
	double area=0;
	double halfPerimeter=getPerimeter()/2.0;
	area=Math.sqrt(halfPerimeter*(halfPerimeter-p1.distance(p2))*(halfPerimeter-p1.distance(p3))*(halfPerimeter-p2.distance(p3)));
	return area;
}
public boolean contains(Point2D p){
Triangle2D t1=new Triangle2D(p1,p2,p);
Triangle2D t2=new Triangle2D(p1,p3,p);
Triangle2D t3=new Triangle2D(p3,p2,p);
/*
 * 如果新点和其他三点分别构成的三角形面积和等于原三角形面积，那么该点就在三角形内部
 */
if(((t1.getArea()+t2.getArea()+t3.getArea())-this.getArea())<0.01){
	return true;
}
else
	return false;
}
public boolean contains(Triangle2D t){
	if(this.contains(t.getP1())&&this.contains(t.getP2())&&this.contains(t.getP3())){
		return true;
	}
	else 
		return false;
}
}
