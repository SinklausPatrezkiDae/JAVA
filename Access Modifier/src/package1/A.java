package package1;
import package2.*; //import semua data dari package2
public class A {
	public static void main(String[] args) {
		
		C c = new C();
		
//		System.out.println(c.defaultMessage);
		
		System.out.println(c.publicMessage);
		
	}
}