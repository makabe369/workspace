package code05;

public class PoisonMatango extends Matango {
	//フィールド-----------------
	int poisonCount =5; //毒を用いた攻撃可能な回数
	
	
	//
	public PoisonMatango(char suffix) {//親クラスでも引数にsuffixを渡しているのでこれしないと、エラーに
		super(suffix);
	}
			
	
	public void attack(Hero h) {//マタンゴのクラスと合わせて記述
		super.attack(h);//まずは通常のお化けキノコ攻撃
		if(this.poisonCount >0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg=h.hp/5;//変数にしないと使いまわしがきかない
			h.hp -=dmg;
			System.out.println(dmg+"のダメージ！");
			this.poisonCount --;//デクリメントをして毒攻撃回数を１減らす。
		}
	}

}
