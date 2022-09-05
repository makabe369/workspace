package code02;

import code01.Hero;

public class SuperHero extends Hero{//superHeroクラスはHeroクラスを継承します
	boolean flying;//飛べるか飛べないか
	public void fly() {
		this.flying=true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying =false;
		System.out.println("着地した！");
	}

}
