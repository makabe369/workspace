
package code15_8_桁を揃える;

public class Hero {
	private String name;
	private String job;
	private int gold;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public Hero() {
		this("ななし","村人",10);
	}
	
	public Hero(String name,String job,int gold) {
		this.name =name;
		this.job =job;
		this.gold = gold;
	}
	

}
