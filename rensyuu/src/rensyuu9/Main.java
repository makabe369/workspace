package rensyuu9;

public class Main {
	// ①
		public static void printArray(String[] arrays) {
			for(String array:arrays) {
				System.out.println(array);
			}
		}

		// ②
		public static int add(int x, int y) {
			return x + y;
		}

		// ③
		public static double mul(double x, double y) {
			return x * y;
		}

		// ④
		public static double div(int x, int y) {
			return (double)x / y;//どっちかがダブル型になっていたらOK
		}

		// ⑤
		public static char[] makeArray() {
			return makeArray(1);
		}

		// ⑥
		public static char[] makeArray(int size) {
			return new char[size];//要素を生成して返す1要素の配列
		}
		public static void main(String[] args) {
			// 上記のメソッドを呼び出すコードを記述しなさい。引数の値は自由に決めて構いませんが型に会った記述をすること。
			// 戻り値がある場合は変数を宣言しそれに戻り値を代入すること。こちらの変数名も自由に決めて構いません。
			// ①

			// ②

			// ③

			// ④

			// ⑤

			// ⑥

		}


}
