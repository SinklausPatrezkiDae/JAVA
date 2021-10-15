import java.util.Scanner;
public class ErrorHandling{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while (true){
			try{
				int x;
				System.out.print("| >> Masukkan Angka : ");
				x = input.nextInt();
				System.out.println(x);
				break;
			}
			catch(Exception e){
				System.out.println("Wkwkwkwkw Goublok");
			}
		}
	}
}