package com.company.lesson5;

public class POJO {

    public static void run() {
        int x = 0;
        long i = 100l, j = 200l, k = 300l;
        byte a1 = 0x06, a2 = 0x07;
        short r1 = 017;


        System.out.println(x);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(r1);

        i = j + k;
        System.out.println(i);

        char symbol = 'f';
        System.out.println(symbol);
        symbol = '\u0042';
        System.out.println(symbol);

        float x1 = 3.5f, x2 = 3.7E6f, x3 = 1.8E-7f;
        double z = 1.0;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(z);

        boolean b1 = 5 > 3;
        boolean b2 = 8 < 1;
        System.out.println(b1);
        System.out.println(b2);

        // Работаем с классами
        String hello = "Hello...";
        System.out.println(hello);

        Integer iVar = 1;
        Long longVar = 1l;
        Double doubleVar = 0.1;
        Boolean booleanVar = true;


    }
}
