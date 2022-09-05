package code14_7;

public class Account {
	String accountNumber; //口座番号
	int zangaku;//残額
	
	//オーバーライド　public String toString(){}
	public String toString() {
		return "\\" + this.zangaku +
				"(口座番号：" + this.accountNumber+")";
		//　）を表示させる。
		
	}
	//オーバーライド　APIリファレンスで調べる。
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {//oがアカウントにキャストして大丈夫か。
			Account a = (Account)o;
			String a1 = a.accountNumber.trim();
			String a2 = a.accountNumber.trim();
			if(a1.equals(a2)) {
				return true;
				
			}
		}
	return false;
	}
	

}
