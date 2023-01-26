
public class stringDers {

	public static void main(String[] args) {
		String mesaj= " Hava bugün çok güzel.";
		System.out.println("Elaman sayısı: " +mesaj.length());
		System.out.println("5.Eleman: "+mesaj.charAt(5));
		System.out.println(mesaj.concat("Merhaba!"));
		System.out.println(mesaj.startsWith("H"));
		System.out.println(mesaj.endsWith("u"));
		System.out.println(mesaj.indexOf("gü"));
		System.out.println(mesaj.lastIndexOf("a"));
		char[] karakterler=new char[4];
		mesaj.getChars(5, 9,karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.replace(" ", "--"));
		System.out.println(mesaj.substring(3,8));
		System.out.println(mesaj.trim());
		System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
				
	}

}
