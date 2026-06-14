package com.pkg;

public class Main {

    public static void main(String[] args) {
        // Create a StringBuffer with initial content
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb); // Hello
        System.out.println(sb.length()); // 5 (number of characters)
        System.out.println(sb.capacity()); // 21 (default capacity: length + 16)

        // Access and modify characters
        System.out.println(sb.charAt(1)); // e
        sb.setCharAt(1, 'i'); // change 'e' to 'i'
        System.out.println(sb); // Hillo

        // Change length (truncate content)
        sb.setLength(2);
        System.out.println(sb); // Hi

        // Append values to StringBuffer
        StringBuffer sb1 = new StringBuffer();
        int a = 20;
        String s = sb1.append("a=").append(a).append("!").toString();
        System.out.println(s); // a=20!

        // Insert substring
        StringBuffer sb2 = new StringBuffer("I Java");
        System.out.println(sb2.insert(2, "like ")); // I like Java

        // Reverse content
        StringBuffer sb3 = new StringBuffer("Hello");
        System.out.println(sb3.reverse()); // olleH

        // Replace substring
        StringBuffer sb4 = new StringBuffer("This is test");
        System.out.println(sb4.replace(5, 7, "was")); // This was test

        // Delete substring and character
        StringBuffer sb5 = new StringBuffer("This is a test");
        System.out.println(sb5.delete(5, 7)); // This  a test
        System.out.println(sb5.deleteCharAt(0)); // his  a test

        // equals() vs toString().equals()
        StringBuffer sb7 = new StringBuffer("Hello");
        StringBuffer sb8 = new StringBuffer("Hello");
        System.out.println(sb7.equals(sb8)); // false (StringBuffer doesn't override equals)
        System.out.println(sb7.toString().equals(sb8.toString())); // true (compare content as String)
    }
}
