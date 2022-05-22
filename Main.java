package metotOrnekler;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 15; //Buradaki değişken isimleri parametredekiler ile aynı olmak zorunda değildir.
		int sayi2 = 90;
		int sayi3 = 5;
		
		
		//Metotları çağırıyoruz
		
		toplama(sayi1, sayi2, sayi3);
		cikarma(sayi1, sayi2, sayi3);
		
		System.out.println(carpma(sayi1, sayi2, sayi3));//return değeri olanları direkt çağırıp kullanamıyoruz çıktıyı görebilmek için bu tarz bir kullanıma ihtiyacımız var.
		System.out.println(bolme());
		System.out.println(carpmaBuyukMu(carpma(0,8,5),bolme()));
		
	

	}
	
	// Parametre olarak göndereceğimiz 3 sayı için toplama, çıkarma, çarpma yaptıralım.
	
	public static void toplama(int sayi1, int sayi2, int sayi3) {//Void yani değer döndürme diyoruz.
		int toplam;
		
		toplam = sayi1 + sayi2 + sayi3;
		//Ekrana yazdıralım.
		System.out.println(toplam);
		
	}
	
	//Çıkarma metodumuzu private olarak tanımlayalım.
	
	private static void cikarma(int sayi1, int sayi2,int sayi3) {//Bu sınıf dışındaki hiçbir sınıf bu metoda doğrudan erişemez.
		int sonuc;
		sonuc = sayi1 - sayi2 - sayi3;
		
		System.out.println(sonuc);
	}
	
	//Çarpma metodumuzu dönüşlü bir değer olarak tanımlayalım.
	public static int carpma(int sayi1, int sayi2, int sayi3) {
		int sonuc; //Farkettiyseniz çıkarma metodunda da aynı değişken tanımlaması var bu da bize bir metot içerisinde tanımlanan değişkenin diğer metotlarda kullanılamadığını gösteriyor.
		sonuc = sayi1 * sayi2 * sayi3;
		
		return sonuc;
	}
	
	//Bölme işlemi için default, double değer döndüren ve parametresiz bir metot tanımlayalım.
	public	static double bolme() {
		double a = 8;
		double b =10.5;
		
		double sonuc = a/b;
		
		return sonuc;
	}
	
	//boolean değer döndüren bir metot tanımlayalım. ve carpma metodu ve bölme metodunun sonuclarını karşılaştıralım
	
	public static boolean carpmaBuyukMu(int carpmaSonuc, double bolmeSonuc) {
		if (carpmaSonuc < bolmeSonuc) {
			return false;
		}
		
		else return true;
	}
	
	
	

}
