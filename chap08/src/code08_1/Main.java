package code08_1;

public class Main {
	public static void main(String[] args) {
		//(以下の内容をjavaで記述していく)
		
		//1.勇者よ、この仮想世界に生まれよ！
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name ="ミナト";
		h.hp =100;
		
		Matango m1 = new Matango();
		m1.hp =50;
		m1.suffix ='A';
		
		Matango m2 =new Matango();
		m2.hp=48;
		m2.suffix ='B';
		
		System.out.println("勇者"+ h.name +"を生み出しました！");
		
		
		
		//3.勇者のメソッドを呼び出していく
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けきのこよ、逃げろ！
		
	}

}
