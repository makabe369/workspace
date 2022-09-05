package code14_4;

public class Hero {
	int hp;
	int mp;
	String name;
	
	public boolean equals (Object o) {
		if(this == o) {return true;}
		if(o instanceof Hero) {
			Hero h =(Hero) o;
			if(this.name.contentEquals(h.name)) {
				
			}
		}
		return false;
	}

}
