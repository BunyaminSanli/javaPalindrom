
package bunyamin;

import java.util.Scanner;


public class mainn {

   
    public static void main(String[] args) {
        int giris= 0;
        while( giris != -1)
        {
            System.out.println("sayı gir");
            
            Scanner a = new Scanner(System.in);
            giris = a.nextInt();
        
            if(giris>=10000000)
            {
                System.out.println("girdiginiz sayi 7 haneli olmalidir");
            }
        
            if(giris % 10 == (giris % 10000000)/1000000 && (giris % 100)/10 == (giris % 1000000)/100000 && (giris % 1000)/100 == (giris % 100000)/10000)
            {
                System.out.println(giris +" palindrom sayi");
            }
            else
            {
                System.out.println(giris + " palindrom degil");
            }
            
        }
    }   
}
