package code14_6;


public class Main {
	public static void main(String[] args) {
		Hero.setRandomMoney();
		//Heroクラスのセットランダムマネーメソッドを呼び出し。
		System.out.println(Hero.money);
		//ランダムな金額を表示
		Hero h1 =new Hero();
		//ヒーローのインスタンス化
		System.out.println(h1.money);
		//勇者の持つお金を表示
	}
}
