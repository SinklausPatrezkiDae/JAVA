import java.io.IOException;
public class ClearScreen{
	public static void main(String[] args){
		for(int i=1; i<100000000; i++){
			System.out.println(i);
			cls();
		}
	}
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}
}