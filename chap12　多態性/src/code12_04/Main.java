package code12_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*Hero h1 =new Hero();
		Hero h2 =new Hero();
		Thief t1= new Thief();
		Wizard w1 =new Wizard();
		Wizard w2 = new Wizard();
		
		//冒険開始
		//まず宿屋に泊まる。
		h1.hp +=50;
		h2.hp +=50;
		t1.hp +=50;
		w1.hp +=50;
		w2.hp +=50;
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		System.out.println(t1.hp);
		System.out.println(w1.hp);
		System.out.println(w2.hp);
	
		
		//code12-7
		Character[] c=new Character[5];
		//キャラクターとしてすべてを認識。→配列とすれば
		c[0] =new Hero();
		c[1] =new Hero();
		c[2] =new Thief();
		c[3] =new Wizard();
		c[4] =new Wizard();
	//宿屋に泊まる
		for (Character ch:c) {//１名ずつ順に取り出し
			ch.hp +=50;
		}
		
		*/
		Monster[] mo=new Monster[3];
		Hero h=new Hero();
		h.name="ミナト";
		
		mo[0] =new Matango();
		
		
		Matango m= new Matango();
		Goblin g= new Goblin();
		Slime s= new Slime();
		
		Monster mo1=m;
		Monster mo2=g;
		Monster mo3=s;
		h.attack(m);
		h.attack(g);
		h.attack(s);
	}
}
