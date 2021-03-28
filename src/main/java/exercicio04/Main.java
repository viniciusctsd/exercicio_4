package exercicio04;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		int i = 0;
		
		while (i<20) {
			System.out.println("Valor i: " + i);
			
			i+= 1;
		}
		System.out.println("________________________________________");
		int k = 0;
		do {
			
			System.out.println("Valor k:" + k);
			k += 1;
		} while (k < 20);
		System.out.println("________________________________________");
		for(int j = 0 ; j < 20; j++) {
			System.out.println("Valor j :" + j);
		}
		System.out.println("________________________________________");
	}

}
