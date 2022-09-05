package Chap14_toString;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h =new Hero("ルフィ",100);
		System.out.println(h.toString());
		Hero h1 = new Hero("ルフィ",100);
		
		if(h.equals(h1)==true) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
		

	}

}
