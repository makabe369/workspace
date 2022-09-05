package code09_04;

public class Hero {
	String name;
	int hp;
	
	public void attack() {
		
	}
	public Hero(String name) {//クラスメイトメソッド名を同じに。　戻り値を指定しない＝ｺﾝｽﾄﾗｸﾀｰ
		//このクラスがnewされたときに自動的に実行される
		this.hp = 100;
		this.name = name;//引数の値でnameﾌｨｰﾙﾄﾞを初期化
	}//初期設定で勝手にhpを１００にしてくれる機能コンストラクタ
}
