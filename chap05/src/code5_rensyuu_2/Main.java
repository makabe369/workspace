package code5_rensyuu_2;

public class Main {
	public static void main(String[] args) {
		String title = "こんにちは";
		String address ="ikue.m39@gmail.com";
		String text = " 今日よかったらごはんでも行きませんか";
		email(title,address,text);
		email(address,text);
		
	}
	public static void email(String title,String address,String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		
	}
	public static void email(String address,String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文" + text);
	}
	

}
