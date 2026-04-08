package POO;

public class controleVelApplication {

	public static void main(String[] args) {
		
		controleVel v1 = new controleVel(50);
		
		v1.acelerar(10);
		v1.reduzir(30);
		System.out.println(v1);
	}
	
	
	
}