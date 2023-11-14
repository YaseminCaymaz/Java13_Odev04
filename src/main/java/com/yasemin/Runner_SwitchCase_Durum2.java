package com.yasemin;

/**
 * ENUM kullanarak Switch-Case yapılabilir.
 */
import com.yasemin.EGunler;
public class Runner_SwitchCase_Durum2  {
    public static void main(String[] args) {

        EGunler gun=EGunler.SATURDAY;
        switch (gun){
            case MONDAY: System.out.println("Pazartesi");break;
            case TUESDAY: System.out.println("Salı");break;
            case WEDNESDAY: System.out.println("Çarşamba");break;
            case THURSDAY: System.out.println("Perşembe");break;
            case FRIDAY: System.out.println("Cuma");break;
            case SATURDAY: System.out.println("Cumartesi");break;
            case SUNDAY: System.out.println("Pazar");break;
        }



    }
}
