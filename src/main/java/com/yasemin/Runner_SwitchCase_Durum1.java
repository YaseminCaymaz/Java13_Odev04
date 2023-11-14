package com.yasemin;

import java.util.Random;

/**
 * Switch-Case Yapısı
 * Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır. Switch Case; tanımlanmış olan yalnızca bir değişkenin,
 * alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan değişkenler byte,
 * short, int, char veya String veri tipine sahip olmalıdır.
 * -->Switch-Case yapısı ilk zamanlar int degişkeniyle kullanılıyordu.Daha sonra byte, short, int ve char tipinde kullanıldı.
 */
public class Runner_SwitchCase_Durum1 {
    public static void main(String[] args) {
        //int degişkeniyle Switch-Case
        int sayi=new Random().nextInt(1,8);
        System.out.print("Haftanın "+sayi+". günü..:");
        switch (sayi){
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("Salı");break;
            case 3: System.out.println("Çarşamba");break;
            case 4: System.out.println("Perşembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
        }


    }
}
