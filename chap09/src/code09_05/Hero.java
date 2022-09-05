package code09_05;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name) {
		this.hp = 100;
		this.name =name;
	}
	
	public Hero() {
		this.hp =100;
		this.name ="ダミー";
	}
	//コンストラクタのオーバーロード。複数コンストラクタを定義した際
	//引数・型・順番に一致するｺﾝｽﾄﾗｸﾀのみ起動。
	//今回は引数があるないで差別化

}
