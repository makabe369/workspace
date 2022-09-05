package code15_5_正規表現の活用;

public class Main3 {
	
	
	public void main(String[] args) {
		if(isValidPlayerName("MINATOII")) {
			System.out.println("正しい記述です");
		}else {
			System.out.println("誤った記述です");
		}
	}

		public static boolean isValidPlayerName(String name) {
			if(name.length() !=8) { //もしネームの長さが8ではなかったら
				return false;
			}
			char first =name.charAt(0);   //指定位置の文字を取り出す。
			if(!(first >= 'A' && first <= 'Z')) {  //firstがA以上、Z以下でないとき
				return false;
			}
			for(int i = 1	; i<8; i++) {  //1～7以下で繰り返す。
				char c=name.charAt(i);   //i字目のｃが…
				if(!((c>= 'A' && c <= 'Z')  || (c >= '0' && c <= '9'))) {  //A以上Z以下もしくは、0字以上9字以下でなかった場合
					return false;
				}
			}
			return true;
		}

	

}
