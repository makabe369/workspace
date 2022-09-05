package code12_02;

public class Main {
	public static void main (String[] args) {
		//Wizardをインスタンス化
		Wizard w =new Wizard();
		
		
		//Matangoをインスタンス化
		Matango m=new Matango();
		//Wizardのネームに朝香を代入
		w.name="アサカ";
		//Wizard朝香はmにアタック
		w.attack(m);
		//火の玉を放つ
		w.fireball(m);
		
		//Character型にwizardを代入
		Character c =w;
		c.name ="ミナト";
		c.attack(m);
		c.fireball(m);
	}

}
