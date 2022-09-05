package code03_練習問題;

public class Main {
	public static void main(String[] args) {
		
		int isHungry =0;
		String food ="おにぎり";
		System.out.println("こんにちは");
		if (isHungry==0) {
			System.out.println("お腹がいっぱいです");
		}else {
				System.out.println("はらぺこです");
		}
		if (isHungry==1) {
				System.out.println(food +"をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		boolean tenki = true ;
		if(tenki == false) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}else {//｛がないと2行は反映されない。
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
			
		System.out.print("［メニュー］1:検索2:登録3:削除4:変更>");
		int selected =new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		   case 1:
			   System.out.println("検索します");
			   break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");	
				break;
			default:
			
		}
		
		System.out.println("数あてゲーム");
		int ans =new java.util.Random(). nextInt(10);
		for (int i=0; i<5 ; i++) {
			System.out.println("0～9までの数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num==ans) {
				System.out.println("あたり！");
				break;//このブレークでこの処理を抜ける。　ループしないように。
			}else {
				System.out.println("違います");
			}
			
		}
		System.out.println("ゲームを終了します");
	}
	
	}
}

