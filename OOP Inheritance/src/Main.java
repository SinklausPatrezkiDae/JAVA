
public class Main {
	public static void main(String[] args) {
		
		Mobil mobil1 = new Mobil();
		Motor motor1 = new Motor();
		Kendaraan kd1 = new Kendaraan();
		
		
		kd1.jalan();
		System.out.println(motor1.pedal);
		System.out.println(mobil1.roda);
	}

}
