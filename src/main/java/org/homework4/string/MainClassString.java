package org.homework4.string;

public class MainClassString {

    /**
     * Part 2. Create the variable "Test_. String, Test1, Part2 ” and perform actions with it.
     * * 1. Remove the gaps at the beginning and end of the thong,
     * *          remove all underscores, commas and periods from the result,
     * *          in the obtained result, find out the length
     * *            should be 26
     * * 2. From the specified string, "cut" a substring from 9 to 21 characters,
     * *          in the obtained result, replace "," with ";",
     * *           in the obtained result, make everything UPPERCASE
     * *              should output "STRING; TEST"
     * * 3. Parse this string comma by comma. Go through the received words and check
     * *            – if the first character of the word 't' or 'T' is NOT empty
     * *            display the message "The first character is (print the first character) in the element (print the word)"
     * *            if not – Print "The first non-empty character (print the first character)".
     * *     The following should come out
     * *          The first T character in the Test_ element. String
     * *          The first T character in the Test1 element
     * *          The first non-empty character is P
     * *
     * * 4. Find the first letter 's' and replace it with 'y' (Only the first letter should be replaced)
     * *           should come out
     * *          Teyt_. String, Test1, Part2
     */
    public static void main(String[] args) {
        String testString = " Test_.  String, Test1 ,  Part2  ";

        //1

        System.out.println("testString is trim and replace(\"_\", \"\") and replace(\",\", \"\") and replace(\".\", \"\") and length() = " + testString.trim().replace("_", "").replace(",", "").replace(".", "").length());

        //2

        System.out.println("testString is trim() and substring(9, 21) and replace(\",\", \";\") and toUpperCase() = " + testString.trim().substring(8, 20).replace(",", ";").toUpperCase());


        //3

        String[] testStringArray = testString.trim().split(",");

        for (int i = 0; i < testStringArray.length; i++) {

            if (testStringArray[i].trim().charAt(0) == 'T' || testStringArray[i].trim().charAt(0) == 't') {
                System.out.println("The first character is " + testStringArray[i].trim().charAt(0) + " in the word " + testStringArray[i].trim());
            } else {
                System.out.println("The first non-empty character is " + testStringArray[i].trim().charAt(0));
            }
        }

        //4

        System.out.println(testString.replaceFirst("s", "y"));


    }
}
