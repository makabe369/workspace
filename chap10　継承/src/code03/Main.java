package code03;

public class Main {
	public static void main(String[] args) {
		Hero h=new Hero();
		h.run();
		SuperHero sh=new SuperHero();
		sh.run();
		
		sh.attack(Matango);
	}

}
