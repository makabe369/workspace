package オブジェクト指向;

public abstract class Monster {
	private int hp;
	private int mp;
	private String name;
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Monster() {
		this(50,50,"モンスター");
	}
	public Monster(int hp,int mp,String name) {
		this.name = name;
		this.hp = hp;
		this.mp =mp;
	}

}
