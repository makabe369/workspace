package code15_6_splitメソッドを使用した文字列の分割;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String s ="abc,def:ghi";//String型に文字列を代入
		String[] words =s.split("[,:]");//カンマかコロンで文字列を分割
		for(String w:words) {           //拡張for文で上記の3要素を繰り返す。
			System.out.print(w + "->");
		}

	}

}
