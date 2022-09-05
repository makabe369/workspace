package code03_3;

public class Main {
	public static void main(String[] args) {
		String str ="夕日";//文字列の比較は＝＝ではなく、(str.equals("")){
		if(str.equals("夕日")) {
			System.out.println("雨が降ってきた");
			
		}
		int age=20;
		int month =5;
		String name = "斉藤";
		if (age >=18 && month ==5) {
			
		}
		if (name.equals("斉藤") || name.equals ("斎藤")) {
			
		}
		int hp = 100;
		boolean poison = false;
		if ((hp < 100 && poison == false) || (hp >= 100 && poison == true)) {
		
		}
		
		if (!( age ==10));//！があるときは、直後の条件式や値のtrueとfalseが逆転する
		
		
		
		
	}

}
