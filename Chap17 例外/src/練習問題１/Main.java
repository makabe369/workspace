package 練習問題１;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			String s =null;
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("NullPointerException 例外をcatchしました");
			System.out.println("--------スタックトレース(ここから)---------");
			e.printStackTrace();
			System.out.println("--------スタックトレース(ここまで)---------");
			
		}
		
	}

}
