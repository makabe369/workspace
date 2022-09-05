package code15_3_文字列を切り出す;
//全角スペースを除去する	trimをつくる
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 ="Java programing";
		System.out.println("文字列s1の4文字目は"+ s1.charAt(3));
		
		System.out.println("文字列s1の4文字目以降は" +
		s1.substring(3));    
		System.out.println("文字列s1の4～8文字目は" +
		s1.substring(3,8));    //位置指定8の文字は含まれない点に
		
		String s2= s1.toLowerCase();
		if(s2.contains("java")) {
			System.out.println("文字列s1は大文字小文字いずれかを含むJavaという文字列を含んでいます");
		}
		s2= s1.toUpperCase();
		if(s2.contains("JAVA")) {
			System.out.println(s2);
			System.out.println("文字列s1は大文字小文字いずれかを含むJavaという文字列を含んでいます");
		}

	}

}
