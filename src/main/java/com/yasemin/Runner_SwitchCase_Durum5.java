package com.yasemin;

import java.util.Scanner;

/**
 * Java 12 ile birlikte, switch ifadesine bazı özellikler eklenmiştir. Bu özellikler arasında "enhanced switch" ve
 * "switch ifadesi" bulunmaktadır. Bu özellikler, switch ifadesini daha esnek ve okunabilir hale getirmek için eklenmiştir.
 * - case statement’ı arrow operator olarak tanımlanabilir hale geldi. Yield yerine bu kullanım daha okunur olduğu için bu
 * ifadenin tercih edilmesi daha faydalı olabilir:
 */
public class Runner_SwitchCase_Durum5 {
    public static void main(String[] args) {
        System.out.println("Taş, Kagıt veya Makas ifadelerinden birini giriniz..:");
        String ifade=new Scanner(System.in).nextLine();

        String sonuc = switch (ifade.toLowerCase()) {
            case "taş" -> "Taş ifadesi seçildi";
            case "kagıt" -> "Kagıt ifadesi seçildi";
            case "makas" -> "Makas ifadesi seçildi";
            default -> "Bilinmeyen ifade";
        };

        System.out.println(sonuc);
    }
}
