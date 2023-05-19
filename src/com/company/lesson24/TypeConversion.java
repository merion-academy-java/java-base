package com.company.lesson24;

public class TypeConversion {

    private static void runStringToByte() {

        // Note: Byte конструктор @Deprecated
        Byte b1 = new Byte("10");
        System.out.println(b1);

        String str2 = "111";
        Byte b2 = Byte.valueOf(str2);
        System.out.println(b2);

        byte b3 = 0;
        String str3 = "100";
        b3 = Byte.parseByte(str3);
        System.out.println(b3);

        String str4 = "20150";
        byte[] b4 = str4.getBytes();
        System.out.println(b4);

        String s = new String(b4);
        System.out.println(s);

    }

    private static void runStringToInt() {
        String str = "1234";

        // Note: Конструктор в таком виде @Deprecated
        Integer i1 = new Integer(str);
        Integer i2 = Integer.valueOf(str);
        int i3 = Integer.parseInt(str);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    private static void runStringToDouble() {
        Double d1 = new Double("1.1234");
        Double d2 = Double.valueOf("12.7e10");
        Double d3 = Double.parseDouble("4.4");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void runStringToBoolean() {
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = Boolean.valueOf("yes");
        Boolean b4 = Boolean.valueOf("1");
        Boolean b5 = Boolean.valueOf("0");

        // Для записи: посмотри внутрь метода, что бы понять как он работает
        Boolean b6 = Boolean.valueOf("TrUe");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }

    public static void run(){
        runStringToByte();
        runStringToInt();
        runStringToDouble();
        runStringToBoolean();
    }
}
