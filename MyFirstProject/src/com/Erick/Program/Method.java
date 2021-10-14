package com.Erick.Program;
import javax.swing.JOptionPane;
import javax.swing.JOptionpane;

public class Method {
	public static void main(String[] args) {
		
		int bil1, bil2, hasil = 0;
		String pil;
		
		bil1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan pertama"));
		pil = JOptionPane.showInputDialog("Masukkan Pilihan Operasi");
		bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan kedua"));
		
		if(pil.equals("+")) {
			hasil = tambah(bil1,bil2);
		}
		else if(pil.equals("-")) {
			hasil = kurang(bil1,bil2);
		}
		else if(pil.equals("*")) {
			hasil = kali(bil1,bil2);
		}
		else if(pil.equals("/")){
			hasil = bagi(bil1,bil2);
		}
		else {
			System.out.println("Kontol lu");
		}
		
		System.out.println("|===============================|");
		System.out.println("|      OUTPUT AKHIR / HASIL     |");
		System.out.println("| >> HASIL DARI "+bil1+pil+bil2+"= "+hasil);
		System.out.println("|===============================|");
		
	
	}

	static void menu() {
		System.out.println("|===============================|");
		System.out.println("|      FUNGSI TANPA RETURN      |");
		System.out.println("|===============================|");
		System.out.println("|>> PILIHAN OPERASI |");
		System.out.println("|>> 1. Penjumlahan  |");
		System.out.println("|>> 2. Pengurangan  |");
		System.out.println("|>> 3. Perkalian    |");
		System.out.println("|>> 4. Pembagian    |");
	}
	

	static int tambah(int x, int y) {
		return x * y;
	}
	static int kurang(int x, int y) {
		return x - y;
	}
	static int kali(int x, int y) {
		return x * y;
	}
	static int bagi(int x, int y) {
		return x / y;
	}
}
