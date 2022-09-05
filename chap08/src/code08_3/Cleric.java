package code08_3;

public class Cleric {
	String name;
	int mp = 10;
	int hp = 50;
	final int MAX_HP =50;
	final int MAX_MP =10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを使用した。");
		this.mp -=5;
		this.hp = MAX_HP;
		System.out.println("聖職者のhpは"+hp+"まで上がった！");
	}
	
	public void fight() {
		System.out.println(this.name + "は攻撃した！");
		this.mp -=5;
		System.out.println(this.name + "のmpは"+this.mp+"になった。");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は"+ sec + "秒天に祈った！");
		int kaihuku =new java.util.Random().nextInt(3) + sec;
		int kaihuku2 =Math.min(this.MAX_MP-this.mp,kaihuku);
		this.mp += kaihuku2;
		System.out.println("すると、聖職者のMPは"+kaihuku2+"回復した。");
		System.out.println("現在のmpは"+this.mp+"である。");
		return kaihuku2;
	}
}




