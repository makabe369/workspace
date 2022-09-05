package rensyuu10;

public class Main {
	public static void main(String[] args) {
		// 以下呼び出しているメソッドをエラーなく呼び出せるよう定義しなさい。
		// 参考 配列データの要素の値の全てに対し+1するメソッド
		int[] array = {1,2,3};
		incArray(array);

		// ① 配列のデータをプリントするメソッド
		printArray(array);
		 System.out.print Array(int );

		// ② int型のデータをdouble型に変換してその値を返すメソッド
		double x = changeIntToDouble(120);

		// ③ int配列のデータを全部加算し合計を返すメソッド
		int sum = addArray(array);

		// ④ double配列のデータを全部加算し合計を返すメソッド
		double[] dbarray = {1.5,2.8,3.4};
		double dbsum = addArray(dbarray);

		// ⑤ char型のデータをString型に変換してその値を返すメソッド
		String zodiac = changeCharToStr('辰');

	}
	// 参考メソッド定義
	public static void incArray(int[] array) {
		for(int i = 0;i < array.length;i++) {
			array[i] ++;
		}
	}
	// ①

	// ②

	// ③

	// ④

	// ⑤


}
