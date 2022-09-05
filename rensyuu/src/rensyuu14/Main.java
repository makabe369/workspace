package rensyuu14;
import rensyuu14.Logic;

public class Main {
	public static void main(String[] args) {
			// 同じクラス内にあるaddメソッド
			// 同じパッケージのLogicクラス内にあるaddメソッド
			// exquiz06_01パッケージのLogicクラス内にあるaddメソッド
			// 上記のそれぞれのメソッドを呼び出しなさい。戻り値がある場合は変数に代入する事。
			// （注：しっかりとメソッドの定義を見て呼び出す事）
			double x1 =(120.0 , 240.0);
			String x2 = add("文字列１","文字列２");
			int x3 = Logic.add(120,240) ;

			// また、この３つのメソッドを呼び出した後
			// import文を使い省略機能を使うとどうなるか？ またなぜそうなるか答えなさい。


		}
		public static double add(double x, double y) {
			return x + y;
		}
		
	}

