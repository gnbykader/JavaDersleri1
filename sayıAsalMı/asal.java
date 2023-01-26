
public class asal {

	public static void main(String[] args) {
		int sayı = 27;
		int kalan = sayı%2;
		System.out.println(kalan);
		boolean isPrime = true;
		
		for(int i=2;i<sayı;i++) {
			if(sayı%i==0) {
				isPrime=false;
			}
		
		}
		if(isPrime) {
			System.out.println("sayı asaldır.");
		}
		else {
			System.out.println("sayı asal değildir.");
		}
	}

}
