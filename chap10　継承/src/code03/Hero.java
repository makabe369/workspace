package code03;

public class Hero {
	//フィールド-----------------
	String name ="ミナト";
	int hp =100;
	
	// 戦うメソッド-----------------
	public  void attack (Matango m) {//引数にマタンゴクラスをmとして召喚
		System.out.println(this.name+"の攻撃！");
		m.hp -=5;//Matangoクラスのhpを削るよ
		System.out.println("５ポイントのダメージを与えた");
	}
	
	//逃げるメソッド-----------------
	public void run() {
		System.out.println(this.name +"は逃げ出した！");
	}
	
	public final void iyake() {
		System.out.println("勇者は嫌気がさした。");
	}

}
