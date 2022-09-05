package rensyuu13;

public class Main {
	public static void main(String[] args) {
		int add = add(120,200);
		int sub = sub(120,200);
		double mul = mul(2.0,4.5);

	}
	// 以下のメソッドを別クラス(Logicクラス)に保存し、
	// それに合わせて上記のmainメソッドで指定しているメソッド呼び出しを修正しなさい。
	public static int add(int x, int y) {
		return x + y;
	}
	public static int sub(int x, int y) {
		return x - y;
	}
	public static double mul(double x, double y) {
		return x * y;
	}

}
