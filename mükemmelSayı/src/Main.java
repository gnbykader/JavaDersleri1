
public class Main {

	public static void main(String[] args) {
		int sayı = 28;
		int toplam=0;
		for(int i=1;i<sayı;i++) {
			if(sayı%i==0) {
				toplam +=i;
			}
		}
		System.out.println(toplam);
		if(sayı==toplam) {
			System.out.println(sayı+" mükemmel sayıdır.");
		}
		else {
			System.out.println(sayı+" mükemmel sayı değildir.");
		}

	}

}
