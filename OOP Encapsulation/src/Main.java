
public class Main{
	public static void main(String[] args) {
		
		//object
		Anime anime1 = new Anime("Attack on Titan","MAPPA",2021);
		
		//set
		anime1.setStudio("WIT");
		anime1.setJudul("Vivy");
		anime1.setTahun(2019);
		
		//output getname
		System.out.println(anime1.getJudul());
		System.out.println(anime1.getStudio());
		System.out.println(anime1.getTahun());
	}
}