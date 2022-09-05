package code12_04;

public abstract class Character {
	int hp;
	String name;
	
	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵"+ m.name +"に１０ポイントのダメージを与えた！");
		m.hp -= 10;
	}

}
