package com.company.lesson23;

import java.util.stream.Stream;

public class StringExample {
    private static String str(){
        return "Добро пожаловать";
    }

    private static void runContentEquals() {
        System.out.println("runContentEquals");
        String str1 = str();
        String str2 = "Учим java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str2: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4 " + result);
    }

    private static void runEqualsIgnoreCase() {
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");

        String str1 = str();
        String str2 = str1;
        String str3 = "Учим java";
        String str4 = "ДОБРО ПожАлОвать";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
    }

    private static void runCompareTo() {
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    private static void runCompareToIgnoreCase() {
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю Метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLowerCase() {
        System.out.println("");
        System.out.println("runToLowerCase");

        String str1 = "Я вызываю метод!";

        System.out.println(str1.toLowerCase());

    }

    private static void runToUpperCase() {
        System.out.println("");
        System.out.println("runToUpperCase");

        String str1 = "Я вызываю метод!";

        System.out.println(str1.toUpperCase());

    }

    private static void runConcat() {
        System.out.println("");
        System.out.println("runConcat");

        String s = "Я вызываю метод!";
        s = s.concat(" И я вызываю класс!");

        s = s + " String";

        System.out.println(s);
    }

    private static void runMatches() {
        System.out.println("");
        System.out.println("runMatches");


        String s = str();

        System.out.println(s.matches("(.*)пож(.*)"));
        System.out.println(s.matches("пож"));
        System.out.println(s.matches("пож(.*)"));

    }

    private static void runContains() {
        System.out.println("");
        System.out.println("runMatches");

        String s = "twinkle twinkle little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("5432"));
    }

    private static void runRegionMatches() {
        System.out.println("");
        System.out.println("runRegionMatches");

        String s1 = str(),
                s2 = "Добро пожаловать",
                s3 = "пожаловать",
                s4 = "ДОБРО ПОЖАЛОВАТЬ";

        System.out.println(s1.regionMatches(0, s2, 0, 10));
        System.out.println(s1.regionMatches(6, s3, 0, 8));
        System.out.println(s1.regionMatches(true, 2, s4, 2, 8));
    }

    private static void runStartWith(){
        System.out.println("");
        System.out.println("runStartWith");

        String s1 = str(),
                s2 = "Добро",
                s3 = "пож",
                s4 = "До";

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    private static void runEndWith(){
        System.out.println("");
        System.out.println("runStartWith");

        String s1 = str(),
                s2 = "пожаловать",
                s3 = "Добро",
                s4 = "ать";

        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));
    }

    private static void runLines(){
        System.out.println("");
        System.out.println("runLines");

        String s = "stafda\n" +
                "sfasdf\n" +
                "asdfafaf\n" +
                "asdfasfas\n" +
                "adfsa\n";

        System.out.println(s);

        Stream<String> lines = s.lines();
        lines.forEach(System.out::println);
        System.out.println(lines);

    }

    private static void runToCharArray(){
        System.out.println("");
        System.out.println("runToCharArray");

        String s1 = str();
        System.out.println(s1.toCharArray()[4]);
    }

    private static void runFormat(){
        System.out.println("");
        System.out.println("runFormat");

        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";

        String fs ;
        fs = String.format("Значение float = %.1f, значение int = %d, значение string = %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

    private static void runValueOf(){
        System.out.println("");
        System.out.println("runValueOf");

        double d = 12312.2;
        boolean b = true;
        long l = 111l;
        char[] chars = {'d','r'};

        System.out.println( String.valueOf(d) );
        System.out.println( String.valueOf(b) );
        System.out.println( String.valueOf(l) );
        System.out.println( String.valueOf(chars) );
    }

    private static void runRepeat(){
        System.out.println("");
        System.out.println("runRepeat");

        String str = "string ";
        String repeat = str.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf(){
        System.out.println("");
        System.out.println("runIndexOf");

        String str = str();
        String sub1 = "Доб", sub2 = "ать";

        System.out.println(str.indexOf(sub1));
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("fds"));
    }

    private static void runLastIndexOf(){
        System.out.println("");
        System.out.println("runLastIndexOf");

        String str = str();
        String sub1 = "о";
        System.out.println(str.lastIndexOf(sub1));
    }

    private static void runSubString(){
        System.out.println("");
        System.out.println("runSubString");

        String str = str();
        System.out.println(str.substring(11, 15));
    }

    private static void runSubSequence(){
        System.out.println("");
        System.out.println("runSubSequence");

        String str = str();
        System.out.println(str.subSequence(0,10));
    }

    private static void runSplit(){
        System.out.println("");
        System.out.println("runSplit");

        String str = "Добро-пожаловать";
        String[] result = str.split("-");
        for(String s: str.split("-")){
            System.out.println(s);
        }
        return;
    }

    private static void runJoin(){
        System.out.println("");
        System.out.println("runJoin");

        String join = String.join(", ","1","2","3");
        System.out.println(join);
    }

    private static void runTrim(){
        System.out.println("");
        System.out.println("runTrim");

        String s = "       String   ";
        System.out.println(s);
        System.out.println(s.trim() );
    }

    private static void runReplace(){
        System.out.println("");
        System.out.println("runReplace");

        String s = str();

        System.out.println(s);
        System.out.println(s.replace("о", "-"));
        System.out.println(s.replaceFirst("о", "-"));
        System.out.println(s.replaceAll("о", "-"));
    }

    public static void run() {
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }
}
