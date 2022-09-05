package ラッパー;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//基本データ型はいれることができない為
		//Integer型でArrayListを宣言
		ArrayList<Integer> points =new ArrayList<Integer>();
		//自動的にIntegerに変換・格納
		points.add(10);
		points.add(80);
		points.add(75);
		
		//拡張for文で配列を回す。
		//int型のiに渡せばint型に戻る
		for(int i:points) {
			System.out.println(i);
		
		/*Integer i1 =Integer.valueOf(16);
		System.out.println(i1);
		int i2 = i1.intValue();
		System.out.println(i2);
		*/
		}

	}

}
