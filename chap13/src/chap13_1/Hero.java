package chap13_1;

public class Hero {
	//フィールドに何も書かないというのは、自分と同じパッケージに属するクラスから許可という意味。ﾊﾟｯｹｰｼﾞﾌﾟﾗｲﾍﾞｰﾄ
		private int hp;
		private String name;
		private Sword sword;
	//定石はフィールドはプライベート。メソッドはﾊﾟﾌﾞﾘｯｸ
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name +"は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	
	void sleep() {
		this.hp=100;//public が消えた＝自分と同じパッケージ属するクラスからのみ許可
		System.out.println(this.name+"は眠って回復した！");
	}
	public void attack(Matango m) {
		System.out.println(this.name +"の攻撃！");
		System.out.println("お化けキノコ"+m.suffix+"から２ポイントの反撃をうけた");
		this.hp -=2;
		if(this.hp <= 0) {
			this.die();
		}
	}
	//ｹﾞｯﾀｰメソッド public ﾌｨｰﾙﾄﾞの型　getﾌｨｰﾙﾄ名()｛return this.フィールド名; }
	//boolean型の時だけ、is　ﾌｨｰﾙﾄﾞ名となる。
	public String getName() {
		return this.name;
	}
	//setterを設定　オーバーロードできなかったので、とりあえず保留 
	/*public void setName(String name) {
		this.name = name;
	}
	*/
	
	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException//エラーを出してプログラムが強制停止する命令
			("名前がnullである。処理を中断。");
		}
	if(name.length() <=1) {
		throw new IllegalArgumentException
		("名前が短すぎる。処理を中断");
	}
	if(name.length() >=8) {
		throw new IllegalArgumentException
		("名前が長すぎる。処理を中断");
	}	
		this.name = name;
	}

}
	
