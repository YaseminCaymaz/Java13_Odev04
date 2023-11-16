package com.yasemin;

import java.util.Scanner;

/**
 *  switch içinde yer alan değerin farklı case’leri için aynı işlem yapılabilmesini sağlamak için tek bir case
 *  ifadesine farklı labellar yazılabilir hale geldi:
 */
public class Runner_SwitchCase_Durum6 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir gün adı giriniz..:");
        String gun=new Scanner(System.in).nextLine();
        String type = switch (gun.toLowerCase()) {
            case "pazartesi","salı","carsamba","persembe","cuma" -> "Haftaici";
            case "cumartesi", "pazar" -> "Haftasonu";
            default->"Hatalı Giriş..";
        };
        System.out.println(type);
    }
}
