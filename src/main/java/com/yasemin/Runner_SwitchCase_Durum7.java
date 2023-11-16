package com.yasemin;

/**
 * Pattern matching: Diyelim ki elimizde bir değer var ve bu değerin tipine göre casting işlemi yaparak dönüştürdüğümüz
 * tipin içerdiği metotları kullanarak belli işlemler yapmamız gerekiyor.
 *  Java 17 ile birlikte case switch-case labellarına daha farklı tipte objeler ekleyebilmeye ve yine label expressionında
 *  cast edebilmeye başladık. Bu sayede pattern matching özelliğini okunurluğu daha yüksek ve daha kolay bir şekilde implement edilebiliyor.
 */

/**
 * -Null Cases: Java 17 öncesinde, switch-case’e geçmiş olduğunuz bir değerin asla null olmaması gerekiyordu. Artık Java 17
 * ile birlikte bu kısıt kaldırıldı ve null olması durumu case labelları ile ele alınabilir hale geldi:
 */
public class Runner_SwitchCase_Durum7 {
    public static void main(String[] args) {
        Object o = 5;
        Object result = switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.toString();
            case String s -> Double.parseDouble(s);
            case null ->0d;
            default -> 0d;
        };
        System.out.println(result);
    }
}
