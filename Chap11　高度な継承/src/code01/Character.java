package code01;

public class Character {
	String name;
	int hp;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//戦う
	public void attack(Matango m) {
		/*System.out.println(this.name +"の攻撃！");
		m.hp -=??;//キャラクターの与えるダメージは各々異なる。
		System.out.println("敵に??ポイントのダメージを与えた！");
		*/
	}

}
