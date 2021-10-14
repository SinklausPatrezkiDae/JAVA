public class Anime{
	//dekalrasi var
	String judul;
	String studio;
	int tahun;
	
	//constructor
	Anime(String judul, String studio, int tahun){
		this.setJudul(judul);
		this.setStudio(studio);
		this.setTahun(tahun);
	}
	
	//getter
	public String getJudul() {
		return judul;
	}
	public String getStudio() {
		return studio;
	}
	public int getTahun() {
		return tahun;
	}
	
	//setter
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public void setTahun(int Tahun) {
		this.tahun = tahun;
	}
}