package Code01;

public class Hero extends Character{
	
	public Hero() {
	}
	public Hero (String name,int hp,int mp) {
		super(name,hp,mp);
	}
	
	public void attack (Monster m) {
		System.out.println(this.name +"の攻撃");
		System.out.println(m.getName() + "に10のダメージ");
		
		
	}

}
