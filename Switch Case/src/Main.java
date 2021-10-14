import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//deklarasi variabel	
		int nilai1,nilai2,hasil;
		nilai1 = 0;
		nilai2 = 0;
		hasil = 0;
		String ulang = "y";
		String pil;
		
		while (ulang.equals("y")) {
			//menu
			menu();

			//inputan nilai
			try {
				System.out.print("| >> Masukkan Bilangan Pertama : ");
				nilai1 = input.nextInt();
			}catch(Exception e) {
				System.out.println("[WARNING] : INPUTAN HANYA MENERIMA ANGKA");
			}
			
			//inputan nilai 2
			try {
				System.out.print("| >> Masukkan Bilangan Kedua : ");
				nilai2 = input.nextInt();
				input.nextLine();
			}catch(Exception e) {
				System.out.println("[WARNING] : INPUTAN HANYA MENERIMA ANGKA");	
			}
			
			//inputan pil
			System.out.print("| >> Masukkan Pilihan Operasi : ");
			pil = input.nextLine();
			
			//switch case
			switch (pil) {
			case "+" :
				hasil = nilai1 + nilai2;
				break;
			case "-":
				hasil = nilai1 - nilai2;
				break;
			case "*":
				hasil = nilai1 * nilai2;
				break;
			case "/":
				hasil = nilai1 / nilai2;
				break;
				
			default:
				System.out.println("Inputan Tidak Tersedia");
			}
			
			System.out.println("|=================================|");
			System.out.println("| >> Hasil Dari : "+nilai1+"+"+nilai2+"="+hasil);
			System.out.println("|=================================|");
			System.out.print("| >> Ulangi Program Y/T : ");
			ulang = input.nextLine().toLowerCase();		
			
		}
		
		
	}
	//fungsi menu
	static void menu() {
		System.out.println("|================================|");
		System.out.println("| PROGRAM KALKULATOR SEDERHANA : |");
		System.out.println("|================================|");
		System.out.println("| PILIHAN OPERASI      |         |");
		System.out.println("| >> [+] : Penjumlahan |         |");
		System.out.println("| >> [-] : Pengurangan |         |");
		System.out.println("| >> [*] : Perkalian   |         |");
		System.out.println("| >> [/] : Pembagian   |         |");
		System.out.println("|================================|");
	}
	
}