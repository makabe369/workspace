package code05;

public class Matango {
	//フィールド-----------------
	int hp =50;
	char suffix;
	//publicの後にクラス名＝newした直後に自動的に実行される処理。＝＝ｺﾝｽﾄﾗｸﾀ
	public Matango(char suffix) {//
		this.suffix =suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ"+this.suffix+"の攻撃");
		System.out.println("10のダメージ");
		h.hp -=10;
	}

}
