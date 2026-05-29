
public class Main {

	public static void main(String[] args) {
    // Create a byte array and convert to String
		byte b[] = {65,66,67,68,69}; //ASCII values for A B C D E
		String s1 = new String(b);
		System.out.println(s1);//ABCDE

    // Create String from a portion of byte array
		String s2 = new String(b,1,3);
		System.out.println(s2);//BCD

    // Create String from char array
		char c[] = {'J','A','V','A'};
		String s3 = new String(c);
		System.out.println(s3);//JAVA

     // Create String from part of char array
		String s4 = new String(c,0,2);
		System.out.println(s4);//JA

    // Create String from another String
		String s5 = new String(s4);
		System.out.println(s5);//JA
    
		//Using charAt()
		String s6 = "Hello";
		System.out.println(s6.charAt(1));//e

    //Using getChars()
		String s7 = "This is a demo of getchars Method";
		int start = 10,end = 14;
		char buf[] = new char[end-start];
		s7.getChars(start, end, buf, 0);
		System.out.println(buf);//demo

    // Using getBytes()
		String s8 = "ABCD";
		byte b1[] =s8.getBytes();
		for(byte b2 :b1)
			System.out.println(b2);//65 66 67 68

    // Using toCharArray()
		char c1[] = s8.toCharArray();
		for(char c2 :c1)
			System.out.println(c2);//A B C D

    // equals() and equalsIgnoreCase()
		String s9 = new String("Hello");
		String s10 = new String("Hello");
		String s11 = new String("HELLO");
		System.out.println(s9.equals(s10));//true
		System.out.println(s9.equals(s11));//false
		System.out.println(s9.equalsIgnoreCase(s11));//true

    // == operator checks reference equality
		System.out.println(s10==s11);//false
		String s12 = s11;
		System.out.println(s11==s12);//true
		String s13 = "Hello";
		String s14 = "Hello";
		System.out.println(s13==s14);//true

    // startsWith, endsWith, toUpperCase, toLowerCase
		System.out.println("Foobar".startsWith("Foo"));//true
		System.out.println("Foobar".endsWith("bar"));//true
		System.out.println("Foobar".toUpperCase());//FOOBAR
		System.out.println("Foobar".toLowerCase());//foobar

    // compareTo()
		System.out.println("hello".compareTo("hello"));//0
		System.out.println("hello".compareTo("cat"));//5
		System.out.println("cat".compareTo("hello"));//-5
		System.out.println("hell".compareTo("heck"));//9

    // indexOf and lastIndexOf
		String s15 = " It is the time for all good men to come their country "
				+ "and pay their due taxes";
		System.out.println(s15.indexOf('t')); //2
		System.out.println(s15.indexOf('T')); //-1
		System.out.println(s15.indexOf("the")); //7
		System.out.println(s15.indexOf(" ")); //0
		System.out.println(s15.indexOf(116,7)); //7
		System.out.println(s15.indexOf("the",7)); //7
		System.out.println(s15.lastIndexOf('t')); //73
		System.out.println(s15.lastIndexOf("the"));  //63
		System.out.println(s15.lastIndexOf("the",62)); //41
		System.out.println(s15.lastIndexOf(116,-75));// -1

    // substring
		String s16 = "HelloWorld";
		System.out.println(s16.substring(5));//World
		System.out.println(s16.substring(2, 6));//lloW

    // length
		String s17 = "Hello";
		System.out.println(s17.length());//5   

    //concat
    s17.concat("world");
    System.out.println(s17);//Hello (immutable)
		System.out.println(s17.concat("World"));//HelloWorld
		
		String s18 = s17.concat("World");
		System.out.println(s18);//HelloWorld

    //trim
		String s19 = " Hello World ";
		System.out.println(s19.length()); //13
		System.out.println(s19.trim()); //Hello world
		System.out.println(s19.length()); //13
		
		String s20 = s19.trim();
		System.out.println(s20.length()); //11
		s19 = s19.trim();
		System.out.println(s19.length()); //11
		
	    String s21 = new String(" hello ");
		  s21 = s21.trim();
	    System.out.println(s21.length()); //5
	}

}
 
