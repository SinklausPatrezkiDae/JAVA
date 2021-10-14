import java.io.IOException;
public class Main{
	public static void main(String[] args) {
		int i;
		
		for (i=0; i<=100; i++) {
			System.out.println(i);
			cls();
		}
	}
	public static void cls() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}