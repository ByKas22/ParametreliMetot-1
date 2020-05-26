/*Klavyeden girilen kelime yada metni tersten yazdıran paramtereli metod kullanımı*/

package odev.pkg5;
import java.util.Scanner; //scanner sınıfını kütüphaneye ekledik.
public class Odev5 
{
    public static void main(String[] args) 
    {
        String kelime; //string türünde değişken oluşturduk.
        Scanner girdi = new Scanner(System.in); //değer girebilmek için scanner sınıfını çağırdık.
        System.out.println("Lütfen Kelimeyi Giriniz..:"); //ekrana yazdırdık.
        kelime=girdi.nextLine(); //klavyeden değer aldı.(Line sayesinde metin girsek bile tersten yazar)
        System.out.println("Kelimenin Tersi..:" + tersten(kelime)); //ekrana kelimenin tersini yazdırdık.
    }
    static String tersten(String kelime) //tersten adında metod oluşturduk.(parametreli)
    {
        String tersi=""; //string veri türünde atama yapabileceğimiz değişken oluşturduk.
            for (int i = kelime.length()-1; i >=0 ; i--) //bu döngüyle kelimemizi tersten yazdırdık.
            {
                tersi = tersi + kelime.charAt(i); //her dizideki kelimeyi tersi değişkenine atayıp toplar.
            }
    return tersi; //geri değer döndürür.
    }  
}
