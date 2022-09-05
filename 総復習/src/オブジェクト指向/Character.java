package オブジェクト指向;

public abstract class Character {
	private int hp;
	private int mp;
	private String name;
	
	void run() {}
	void attack(Monster m) {}

	
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
	
	
	
	public Character(int hp,int mp,String name) {
		this.hp = hp;
		this.mp = mp;
		this.name =name;
	}
	public Character() {
		this(100,50,"モモ");
	}
}
