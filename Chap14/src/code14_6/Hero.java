package code14_6;

public class Hero {
	String name;
	int hp;
	static int money;
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		//勇者たちが持つお金をランダムに決める。
		System.out.println("勇者たちの所持金を初期化しました");
	}

}
