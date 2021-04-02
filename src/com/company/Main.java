package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod(23, 19));//1

        System.out.println(plans(19, 20));//2

        System.out.println(method(25, 30));//3
        System.out.println(method1(5, 10));
        method2(25, 26);
        method2(40, 56);
        method2(45, 45);

        //ДЗ нва сообразительности
       // String gene = a + (int) (Math.random() * b);
        System.out.println("тебе" +Math.random() + "лет");
    }

    //
    public static String myMethod(int age, int temperature) {
        return "age:" + age + " " + "tempature:" + temperature;
    }

    public static String plans(int age, int temperature) {
        if (age > 20 && age < 40 && temperature > -20 && temperature < 30)
            return "Можно идти гулять";
// 2
        else if (age < 20 && temperature == 0 || temperature < 28)
            return "Можно идти гулять2";
        else if (age > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static int method(int x, int y) {
        return x + y;
    }

    public static int method1(int a, int b) {
        return a * b;
    }

    public static void method2(int s, int p) {
        System.out.println("результат:" + (s + p));
    }


    //ДЗ нва сообразительности
    public static String generateRandomAge() {


        return "ваш возрасть";
    }
}
