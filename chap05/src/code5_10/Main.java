package code5_10;
//仮引数が異なれば同じ名前のメソッドを複数定義することができる。
public class Main {
	public static int add(int x, int y) {//１つ目のメソッド
		return x + y;
	}
	public static double add(double x, double y) {//２つ目のメソッド
		return x + y;
	}
	public static String add(String x, String y) {//３つ目のメソッド
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(3.5,2.7));
		System.out.println(add("Hello","World"));
	}

}
