package code5_rensyuu_3;

public class Main {
	public static void main(String[] args) {
		double triangleArea =calcTraiangleArea(10.0,5.0);
		System.out.println("三角形の面積："+ triangleArea +"㎠");
		double circleArea =calcCircleArea(5.0);
		System.out.println("円の面積" + circleArea + "㎠");
	}
	public static double calcTraiangleArea(double bottom,double height) {
		//ダブル型でリターンするから戻り値はdouble
		double area =(bottom * height) / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		final double PI =3.14;
		double area = radius * radius * PI;
		return area;
	}
}
	
