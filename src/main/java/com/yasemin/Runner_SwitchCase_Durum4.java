package com.yasemin;

import java.util.Scanner;

/**
 *  Switch statemen’ı artık bir switch expression’a dönüştü. Yani assign edilebilen, return edilebilen bir yapıya kavuştu.
 *  Fakat return edilecek ifadeden önce yield kullanılması gerekir:
 */
public class Runner_SwitchCase_Durum4 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir gün adı giriniz..:");
        String gun=new Scanner(System.in).nextLine();
        String type =
                switch (gun.toLowerCase()) {
                    case "pazartesi":
                        yield "Haftaiçi";
                    case "salı":
                        yield "Haftaiçi";
                    case "çarşamba":
                        yield "Haftaiçi";
                    case "perşembe":
                        yield "Haftaiçi";
                    case "cuma":
                        yield "Haftaiçi";
                    case "cumartesi":
                        yield "Haftasonu";
                    case "pazar":
                        yield "Haftasonu";
                    default:
                        yield "Hatalı giriş..";
                };
        System.out.println(gun+" -> "+type);

    }
}
