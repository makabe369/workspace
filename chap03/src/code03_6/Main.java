package code03_6;

public class Main {
	public static void main(String[] args) {
		//breakを入れることを逆手にとって実行させる
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random() .nextInt(5)+1;//1~5の乱数発生
		// 整数　文字列　文字であればswitch文可能だが、それ以外は×
		switch( fortune ) {
		case 1:
		case 2:
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん…");
		}
		
	}

}
