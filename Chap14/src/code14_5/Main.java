package code14_5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero.money =10;
		System.out.println(Hero.money);
		
		Hero h1 =new Hero();
		Hero h2 =new Hero();
		Hero.money =100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.money =300;
		System.out.println(h2.money);
		System.out.println(h1.hp);
		System.out.println(Hero.money);
	
	
	}

}
