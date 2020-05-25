
package odev.pkg5;

import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) 
    {
        String kelime;
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("Lütfen Kelimeyi Giriniz..:");
        kelime=girdi.nextLine();
        System.out.println("Kelimenin Tersi..:" + tersten(kelime));
    }
    static String tersten(String kelime)
    {
        String tersi="";
            for (int i = kelime.length()-1; i >=0 ; i--) 
            {
                tersi = tersi + kelime.charAt(i);
            }
    return tersi;
    }  
}
