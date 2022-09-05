package code12_05;

import code12_03.Monster;
import code12_04.Goblin;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Monster[] mo = new Monster[3];
	mo[0]=new Slime();
	mo[1]=new Goblin();
	mo[2]=new Matango();
	for (Monster m :mo) {
		m.run();
	}
	}

}
