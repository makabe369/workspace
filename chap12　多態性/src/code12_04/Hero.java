package code12_04;

public class Hero extends Character{
	public void  attack(Monster m) {
		System.out.println(this.name +"の攻撃");
		System.out.println("敵に１０ポイントのダメージを与えた");
		m.hp -=10;
		
		
	}
	

}
