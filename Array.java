public class Array{
	public static void main(String[] args){

		String[] arrayBrg = {"mouse","laptop","keyboard","buku"};
		int[] hargaBrg = {250000,8000000,250000,200000};

		for(int i=0; i<arrayBrg.length;i++){
			System.out.println("\nBarang = "+arrayBrg[i]);
			System.out.println("Harga = "+hargaBrg[i]);
		}
	}
}