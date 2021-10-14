package com.Erick.Program;
public class Manusia{
	String nama;
	int umur;
	double beratBadan;
	
	//constructor
	Manusia(String nama, int umur, double beratBadan){
		this.nama = nama;
		this.umur = umur;
		this.beratBadan = beratBadan;
	}
	
	//method tampilkandata
	void data() {
		System.out.println("Nama : "+this.nama+
				"\nUmur : "+this.umur+
				"\nBerat : "+this.beratBadan);
	}
}