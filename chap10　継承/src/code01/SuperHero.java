package code01;

public class SuperHero {
	//フィールド-----------------
	String name ="ミナト";
	int hp =100;
	boolean flying;
	
	// 戦うメソッド-----------------
	public void attack (Matango m) {//引数にマタンゴクラスをmとして召喚
		System.out.println(this.name+"の攻撃！");
		m.hp -=5;//Matangoクラスのhpを削るよ
		System.out.println("５ポイントのダメージを与えた");
	}
	
	//逃げるメソッド-----------------
	public void run() {
		System.out.println(this.name +"は逃げ出した！");
	}
	
	//
	public void fly() {
		this.flying =true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

}
