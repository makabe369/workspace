package code04;

public interface CleaningService {//インターフェイスには接点という意味がある。
	//フィールド-----------------
	int price = 1000;
	Shirt washShirt(Shirt s);
	Towl washTowl(Towl T);
	Coat washCoat(Coat c);

}
