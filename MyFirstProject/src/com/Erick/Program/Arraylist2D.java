package com.Erick.Program;
import java.util.*;

public class Arraylist2D{
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> semua = new ArrayList();
		
		ArrayList<String> kodeBrg = new ArrayList();
		kodeBrg.add("a");
		kodeBrg.add("b");
		kodeBrg.add("c");
		
		ArrayList<String> barang = new ArrayList();
		barang.add("Laptop");
		barang.add("Mouse");
		barang.add("Keyboard");
		
		ArrayList<String> harga = new ArrayList();
		harga.add("5000000");
		harga.add("250000");
		harga.add("300000");
		
		semua.add(kodeBrg);
		semua.add(barang);
		semua.add(harga);
		
		for(int i=0; i<semua.size(); i++) {
			System.out.println(semua.get(i));
		}

		
	}
}