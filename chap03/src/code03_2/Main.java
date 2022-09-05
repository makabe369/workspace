package code03_2;

public class Main {
	public static void main(String[] args) {
		//波かっこを省略した記述
		boolean tenki= true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
			
		} else //{　が省略されている。内容が一行しかない場合には省略可能
			System.out.println("DVDを見ます");
			System.out.println("昼寝をします");//1行のみ反映されるため、DVDを見ますのみが表示されてしまう！
	}

}
