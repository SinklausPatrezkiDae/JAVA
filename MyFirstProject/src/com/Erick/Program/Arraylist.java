package com.Erick.Program;
import java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		//deklarasi var 
		int pil;
		
		//arraylist kodebarang
		ArrayList<Integer> kdBarang = new ArrayList();  
		kdBarang.add(1);
		kdBarang.add(2);
		kdBarang.add(3);
		kdBarang.add(4);
		
		//arraylist barang
		ArrayList<String> barang = new ArrayList();
		barang.add("Kopi");
		barang.add("Gula");
		barang.add("Susu");
		barang.add("Buku");
		
		
		System.out.print("| >> Masukkan Kode Barang : ");
		pil = input.nextInt();
		
		for(int i=1; i<kdBarang.size(); i++) {
			if(pil == kdBarang.get(i)) {
				System.out.println(barang.get(i));
			}
		}
		
		
		
	}

}
