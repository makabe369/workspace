package code14_3;

import code14_2.Hero;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 =new Hero();
		h2.name ="ミナト";
		if(h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		
		System.out.println(h1);
		System.out.println(h2);
	}

}
