package code04;

public class Main {
	public static void main(String[] args) {
		KyotoCleaningShop kshop =new KyotoCleaningShop();
		System.out.println(KyotoCleaningShop.price);
		System.out.println(kshop.price);
		kshop.ownerName = "ナナエ";
		System.out.println(kshop.ownerName);
	}

}
