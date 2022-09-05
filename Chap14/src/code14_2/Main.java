package code14_2;

public class Main {
	public static void main(String[] args) {
		Object e = new Empty();
		Object o = new Hero();
		Object s = "こんにちは";
		System.out.println(s);
		printAnything(s);
	}
	public void printAnyThing(Object o) {
		//何型でもいいから、引数を1つ受け取り画面に表示
		System.out.println(o.toString());
		
		Hero h = new Hero() ;
		h.name ="ミナト";
		h.hp =100;
		System.out.println(h.toString());
		
		
			
			
		}
	}
	


