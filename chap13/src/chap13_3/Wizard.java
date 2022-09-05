package chap13_3;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
		
	public void heal(Hero h) {
		int basePoint =10;
		int recovPoint =
				(int)(basePoint * this.getWand().getPower());
		//ワンドクラスのもパワー同じクラス内でもゲッターを用いる。
		//wand.getPowerと書きがち。
		setHp(getHp() + recovPoint);
		System.out.println(getName() +"のHPを" + recovPoint + "回復した！");
	}
	
	public int getHp() {return this.hp;}//getter HP
	public void setHp(int hp) {this.hp = hp;	}//setter Hp
	public int getMp() {return this.mp;}//getter MP
	public void setMp(int mp) {this.mp =mp;}//setter MP
	public String getName() {return this.name;	}//getter NAME
	public void setName(String name) {	this.name =name;}
	public Wand getWand() {return this.wand;}
	public void setWand(Wand wand) {this.wand =wand;}

}
