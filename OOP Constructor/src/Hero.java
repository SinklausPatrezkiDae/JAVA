
public class Hero {
	String nama;
	double darah;
	double attackpower;
	double armor;
	
	//constructor
	Hero(String nama, double darah, double attackpower, double armor){
		this.nama = nama;
		this.darah = darah;
		this.attackpower = attackpower;
		this.armor = armor;
	}
	
	void showData() {
		System.out.println("Hero ini bernama : " + this.nama);
		System.out.println("Darah Hero ini : " + this.darah);
		System.out.println("Attack Power Hero : " + this.attackpower);
		System.out.println("Armor Hero : " + this.armor);
	}
}
