package zrj;
public class Point2D {
private double x;
private double y;
public Point2D(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "Point2D [x=" + x + ", y=" + y + "]";
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public double distance(double x,double y){
	double length=0;
	length=Math.sqrt(Math.abs(x-this.x)*Math.abs(x-this.x)+Math.abs(y-this.y)*Math.abs(y-this.y));
	return length;
}
public double distance(Point2D p){
	double length=0;
	length=Math.sqrt(Math.abs(p.getX()-this.x)*Math.abs(p.getX()-this.x)+Math.abs(p.getY()-this.y)*Math.abs(p.getY()-this.y));
	return length;
}
}
