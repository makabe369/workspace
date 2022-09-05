package code08_2;

public class Hero {
	String name; //名前の宣言
	int hp;		//HPの宣言
	//属性を宣言するにはクラスブロックの中に変数宣言を記述
	
	public void sleep(){
		this.hp =100;
		System.out.println(this.name+"は、眠って回復した！");
		}
		
	}

