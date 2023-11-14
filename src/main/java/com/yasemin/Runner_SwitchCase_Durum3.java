package com.yasemin;

import java.util.Scanner;

/**
 * Switch-Case String kullanımı
 */
public class Runner_SwitchCase_Durum3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir gün adı girin: ");
        String gunAdi = scanner.nextLine();

        switch (gunAdi.toLowerCase()) {
            case "pazartesi":
                System.out.println("Haftanın ilk günü");
                break;
            case "sali":
                System.out.println("Haftanın ikinci günü");
                break;
            case "carsamba":
                System.out.println("Haftanın üçüncü günü");
                break;
            case "persembe":
                System.out.println("Haftanın dördüncü günü");
                break;
            case "cuma":
                System.out.println("Haftanın beşinci günü");
                break;
            case "cumartesi":
                System.out.println("Haftasonu, keyifli gün!");
                break;
            case "pazar":
                System.out.println("Haftasonu, dinlenme günü");
                break;
            default:
                System.out.println("Geçersiz gün adı");
        }
    }
}
