package code03;

public interface Creature {//最大限に抽象化されたクラス　生き物
	public abstract void run();
	void attack(Monster m);
	double PI=3.1414926;//フィールドの場合定数しか存在しない
			
	
//インターフェイスの場合、必ず抽象メソッドになる。
}
