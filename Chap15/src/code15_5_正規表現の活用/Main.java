package code15_5_正規表現の活用;

public class Main {
	
	public static void main(String[] args) {
		
		boolean C = "ab".matches("[a-c]{3}");
		System.out.println(C);
		if(isValidPlayerName("MINATO01")) {
			System.out.println("正しい記述です");
		}else {
			System.out.println("誤った記述です");
		}
		
		
		
	}
	//メインメソッドから同じクラスのメソッドを呼び出すには、静的メソッドでなくてはならない。
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
		//matchesメソッドを使用。文字列パターン
		//パターンマッチング
	}

}
