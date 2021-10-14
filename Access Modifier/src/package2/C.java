package package2;
import package1.*; //import semuanya data dari package1
public class C {
	
	public String publicMessage = "This is Public"; // bisa diakses semua class
	String defaultMessage = "This is Default Message"; //hanya bisa di akses sub class
}
