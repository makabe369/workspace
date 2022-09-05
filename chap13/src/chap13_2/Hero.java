package chap13_2;

import chap13_1.Sword;

public class Hero {
	private int hp;//アクセス修飾子　publicではなくprivateになっている。制限が厳しい
	String name;
	Sword sword;
	
	public void sleep() {
		this.hp =100;
		System.out.println(this.name +"は眠って回復した");
	}

}
