package Code17_12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			throw new UnsupportedMusicFileException
			//自分でエラー対策したクラスに投げる。
			("未対応のファイルです");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
