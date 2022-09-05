package Code01;

public abstract class Character {
	private int hp;
	private int mp;
	private String name;
	
	public Character() {
		this("名無し",100.20
				)
	}
	
	//コンストラクタ
	public Character(String name,int hp,int mp) {
		this.hp =100;
		this.name =name;
		this.mp = 100;
		
	}
	//逃げる
	public void run() {
			System.out.println(this.name +"は逃げ出した");
	}
	
	//戦う
	public void attack(Monster m) {
		System.out.println(this.name +"は" + m.name +"に攻撃した");
		System.out.println(m.name + "のHPは５減った！");
		m.hp -= 5;
		
	}

}
