package org.string;

import java.util.Locale;

public class MainClassString {
    public static void main(String[] args) {
        String testString = "Test String. ";
        System.out.println("'" + testString + "'");
        System.out.println("'" + testString.trim() + "'");
        System.out.println("'" + testString + "'");

        String testString_2 = new String("Test String. ");

        if (testString.equals(testString_2)) {        // == - compare link for objects
            System.out.println("testString equal testString_2");
        } else {
            System.out.println("testString not equal testString_2");
        }

        "Test".equalsIgnoreCase("teSt");
        "Test".toLowerCase();//  -> test
        "Test".toLowerCase().equals("teSt".toLowerCase()); //true
        String[] varString = "Test test1 test2".split(" ");
        System.out.println(varString[1]);// -> {"Test", "test1", "test2"} - array of strings

        System.out.println(" Test ".replace("e", "E"));// -> "Test"


        System.out.println("Test test1 test2".toLowerCase().replace("t", "T").trim());



        System.out.println(testString.length());
        System.out.println(testString.charAt(0));
        System.out.println(testString.charAt(1));
        System.out.println(testString.charAt(2));
        System.out.println(testString.charAt(3));
        System.out.println(testString.charAt(4));
        //System.out.println(testString.charAt(5));
        System.out.println(testString.charAt(testString.length() - 1));
        System.out.println(testString.charAt(testString.length() - 2));
        System.out.println(testString.charAt(testString.length() - 3));
        System.out.println(testString.charAt(testString.length() - 4));
        System.out.println(testString.charAt(testString.length() - 5));
        //System.out.println(testString.charAt(testString.length() - 6));
        System.out.println(testString.substring(0, 1));
        System.out.println(testString.substring(1, 2));
        System.out.println(testString.substring(2, 3));
        System.out.println(testString.substring(3, 4));
        System.out.println(testString.substring(4, 5));
        //System.out.println(testString.substring(5, 6));
        System.out.println(testString.substring(testString.length() - 1, testString.length()));
        System.out.println(testString.substring(testString.length() - 2, testString.length() - 1));
        System.out.println(testString.substring(testString.length() - 3, testString.length() - 2));
        System.out.println(testString.substring(testString.length() - 4, testString.length() - 3));
        System.out.println(testString.substring(testString.length() - 5, testString.length() - 4));
        //System.out.println(testString.substring(testString.length() - 6, testString.length() - 5));
        System.out.println(testString.substring(0, 2));
        System.out.println(testString.substring(1, 3));
        System.out.println(testString.substring(2, 4));
        System.out.println(testString.substring(3, 5));
        //System.out.println(testString.substring(4, 6));
        System.out.println(testString.substring(testString.length() - 2, testString.length()));
        System.out.println(testString.substring(testString.length() - 3, testString.length() - 1));
        System.out.println(testString.substring(testString.length() - 4, testString.length() - 2));
        System.out.println(testString.substring(testString.length() - 5, testString.length() - 3));
        //System.out.println(testString.substring(testString.length() - 6, testString.length() -
    }
}
