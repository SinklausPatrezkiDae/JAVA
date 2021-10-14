package arraylist;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String item,tambah;
		int counter = 0;
		ArrayList<String> barang = new ArrayList<String>();
		tambah = "yes";
		while (tambah.equals("yes")) {
			menu();
			System.out.print("| >> Masukkan Item : ");
			item = input.nextLine().toUpperCase();
			barang.add(item);
			counter++;
			System.out.print("| >> Tambah barang? <yes/no> : ");
			tambah = input.nextLine().toLowerCase();			
		}
		System.out.println("==========================");
		for(String i : barang) {
			System.out.println(i);
		}
		System.out.println("==========================");
		
	}
	static void menu() {
		System.out.println("|=========================|");
		System.out.println("|======= MENU UTAMA ======|");
		System.out.println("|=========================|");
	}
}
