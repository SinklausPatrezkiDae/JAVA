package package2;
import package1.*; //import semua data dari package 1

//class Asub merupakan turunan dari class A
public class Asub extends A {
	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c.defaultMessage);
		System.out.println(c.publicMessage);
	}
}
