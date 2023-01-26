
public class main {

	public static void main(String[] args) {
		double[] myList = {1.3,2.6,7.8,4.0,3.3};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			System.out.println(number);
			total+=number;
			if(max<number) {
				max=number;
			}
			
		}
		System.out.println("sayıların toplamı: "+total);
		System.out.println("en büyük sayı: "+max);
	}

}
