package Code01;

public abstract class  Monster {
	private int hp;
	private int mp;
	private String name;//種族名
	
	
	public Monster(String name,int hp,int mp) {
		this.hp = 100;
		this.mp = 100;
		this.name=name;
	}
	
	
	public void run() {
		System.out.println(this.name +"は逃げ出した‼");
	}
	public void attack(Character c) {
		System.out.println(this.name +"は"+ c.name +"に攻撃した！");
		c.hp -=10;
		System.out.println(c.name + "のHpは１０ポイント減った！");
	}

}
