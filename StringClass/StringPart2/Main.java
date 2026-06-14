public class Main {

    public static void main(String[] args) {
        // Splitting a string using "-" as delimiter
        String s1 = "one-two-three";
        String[] t1 = s1.split("-");
        for (String t : t1)
            System.out.println(t); // one, two, three

        // Splitting a string using "." (dot requires escaping in regex)
        String s2 = "one.two.three";
        String[] t2 = s2.split("\\.");
        for (String t : t2)
            System.out.println(t); // one, two, three

        // Splitting using "*" (also requires escaping)
        String s3 = "A*bunch*of*stars";
        String[] t3 = s3.split("\\*");
        for (String t : t3)
            System.out.println(t); // A, bunch, of, stars

        // Splitting with a limit (2 parts only)
        String[] t4 = s3.split("\\*", 2);
        for (String t : t4)
            System.out.println(t); // A, bunch*of*stars

        // Splitting using "s" as delimiter
        String s4 = "String is a class";
        String[] t5 = s4.split("s");
        for (String t : t5)
            System.out.println(t); // String i,  a cla

        // Splitting using multiple delimiters (regex OR)
        String s5 = "No concession, no concession, no compromise and just give and take policy";
        String[] t6 = s5.split("concession|compromise|(give and take)");
        for (String t : t6)
            System.out.println(t); // No , , no , , no , and just , policy

        // Using matches() with regex
        String s6 = "Welcome to Java";
        System.out.println(s6.matches("(.*) to PHP")); // false
        System.out.println(s6.matches("Welcome to (.*)")); // true
        System.out.println(s6.matches("(.*) to (.*)")); // true
        System.out.println(s6.matches("(.*)")); // true

        // Using regionMatches()
        String s7 = "ABC Windows Test";
        System.out.println(s7.regionMatches(true, 4, "Windows", 0, 7)); // true

        // Unicode code point methods
        System.out.println("abcd".codePointAt(0)); // 97 ('a')
        System.out.println("abcd".codePointBefore(2)); // 98 ('b')
        System.out.println("abcd".codePointCount(0, 4)); // 4

        // contains() method
        System.out.println("hello".contains("e")); // true
        System.out.println("hello".contains("E")); // false

        // join() method
        System.out.println(String.join("-", "one", "two", "three")); // one-two-three

        // copyValueOf() method
        char c[] = {'a','b','c','d','e','f','g'};
        String s8 = "";
        System.out.println(s8.copyValueOf(c)); // abcdefg
        System.out.println(s8.copyValueOf(c, 3, 2)); // de

        // String.format() examples
        int a = 23;
        System.out.println(String.format("%d", a)); // 23
        System.out.println(String.format("|%d|", a)); // |23|
        System.out.println(String.format("|%5d|", a)); // |   23|
        System.out.println(String.format("|%-5d|", a)); // |23   |
        System.out.println(String.format("|%07d|", a)); // |0000023|
        System.out.println(String.format("|%f|", 345.344)); // |345.344000|
        System.out.println(String.format("|%.2f|", 345.344)); // |345.34|
        System.out.println(String.format("|%8.2f|", 345.344)); // |  345.34|
    }
}

