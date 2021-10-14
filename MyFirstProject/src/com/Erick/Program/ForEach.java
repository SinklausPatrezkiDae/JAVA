package com.Erick.Program;
import java.util.*;
public class ForEach{
	public static void main(String[] args) {
			
		ArrayList<ArrayList<String>> semua = new ArrayList();
		
		ArrayList<String> kdbrg = new ArrayList();
		kdbrg.add("a");
		kdbrg.add("b");
		kdbrg.add("c");
		kdbrg.add("d");
		ArrayList<String> barang = new ArrayList();
		barang.add("Laptop");
		barang.add("Mouse");
		barang.add("Keyboard");
		barang.add("Handphone");
		
		semua.add(kdbrg);
		semua.add(barang);
		
		for(int i=0; i<semua.size();i++) {
			for(int j=0; j<semua.size();j++) {
				System.out.print(semua.get(j));
			}
			System.out.println();
		}
	}

}