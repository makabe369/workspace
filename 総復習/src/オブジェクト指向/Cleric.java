package オブジェクト指向;

public class Cleric extends Character{
	public Cleric(int hp, int mp,String name) {
		super(hp,mp,name);
	}
	
	public void run() {
		System.out.println(this.getName +"は杖に乗って逃げた");
		
	}
	@Override
	public void attack(Monster m) {
		// TODO 自動生成されたメソッド・スタブ
		super.attack(m);
	}

}
