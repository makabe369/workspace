package code02;

public abstract class Character {
	//抽象メソッドを含むクラスは必ずabstract付きのメソッドになければならない。
	String name;
	int hp;

	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//戦う
	public abstract void attack(Matango m) ;
	//未完成ですよのメソッド　アブストラクトメソッドという
		/*System.out.println(this.name +"の攻撃！");
		m.hp -=??;//キャラクターの与えるダメージは各々異なる。
		System.out.println("敵に??ポイントのダメージを与えた！");
		*/
	

}
