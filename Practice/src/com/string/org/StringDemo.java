package com.string.org;

public class StringDemo {

	public static void main(String[] args) {
		// *********SubString**********\\

		String s = "toyota";

		// startIndex: inclusive
		System.out.println(s.substring(2));

		// endIndex: exclusive
		System.out.println(s.substring(2, 4));

		System.out.println("*******************");
		// *********Split**********\\

		String items = "Pizza-Burger-Naan-Fries";
		System.out.println("-------Split--------");
		String foods[] = items.split("-");
		for (String food : foods) {
			System.out.println(food);
		}

		System.out.println("-------Split-With-Limit--------");

		String foods2[] = items.split("-", 2);
		for (String food : foods2) {
			System.out.println(food);
		}

		System.out.println("*******************");

		// *********CompareTo()**********\\

		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		System.out.println(s1.compareTo(s2));// 0 because both are equal
		System.out.println(s1.compareTo(s3));// -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4));// -1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5));// 2 because "h" is 2 times greater than "f"

		System.out.println("*******************");

		// *********Concat()**********\\

		String name = "Anthony";
		System.out.println(name.hashCode());
		name = name.concat(" Hales");
		System.out.println(name);
		System.out.println(name.hashCode());

		System.out.println("*******************");

		// *********equals()**********\\

		String a = "javatpoint";
		String b = "javatpoint";
		String c = "JAVATPOINT";
		String d = "python";
		System.out.println(a.equals(b));// true because content and case is same
		System.out.println(a.equals(c));// false because case is not same
		System.out.println(a.equals(d));// false because content is not same

		System.out.println("*******************");

		// *********contentEquals()**********\\

		String str1 = "First String";
		String str2 = "Second String";
		StringBuffer str3 = new StringBuffer("Second String");
		StringBuffer str4 = new StringBuffer("First String");
		System.out.println("str1 equals to str3:" + str1.contentEquals(str3));
		System.out.println("str2 equals to str3:" + str2.contentEquals(str3));
		System.out.println("str1 equals to str4:" + str1.contentEquals(str4));
		System.out.println("str2 equals to str4:" + str2.contentEquals(str4));
		
		System.out.println("*******************");

		// *********copyValueOf()**********\\

		char[] data = {'a','b','c','d','e','f','g','h','i','j','k'};
	       String test = "Text";
	       String test2 = "String";
	       //Variation 1:String copyValueOf(char[] data)
	       test = test.copyValueOf(data);
	       System.out.println("str1 after copy: " + test);

	       //Variation 2:String copyValueOf(char[] data,int offset,int count)
	       // offset is the initial index from where characters needs to be copied and count is a number of characters to copy. 
	       test2 = test2.copyValueOf(data, 5, 3 );
	       System.out.println("str2 after copy: " + test2);
	       
	       System.out.println("*******************");

			// *********String.format()**********\\
	       
	       String sname="sonoo";  
	       String sf1=String.format("name is %s",sname);  
	       String sf2=String.format("value is %f",32.33434);  
	       String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
	         
	       System.out.println(sf1);  
	       System.out.println(sf2);  
	       System.out.println(sf3);  
	       
	       System.out.println("*******************");

			// *********trim()**********\\
	       
	       // trims the trailing and leading spaces  
	       String geek = " geeks for geeks has all java functions to read  ";  
	       System.out.println(geek.trim());   
	         
	       // trims the leading spaces  
	       geek = " Chetna loves reading books";  
	       System.out.println(geek.trim());   
	         
	       System.out.println("*******************");

			// *********valueOf()**********\\
	       
	       //The java string valueOf() method converts different types of 
	       //values into string. By the help of string valueOf() method, you can convert 
	       //int to string, long to string, boolean to string, character to string,
	       //float to string, double to string, object to string and char array to string.

	       boolean bol = true; 
	       int value=30;  
	       String s6=String.valueOf(value);
	       String s7 = String.valueOf(bol);   
	       System.out.println(s6+10);//concatenating string with 10
	       System.out.println(s7+1000);//concatenating boolean with 1000
	       
	       
	       System.out.println("*******************");

			// *********startsWith()**********\\
	       
	       
	       //boolean startsWith(String str): It returns true if the String str is a prefix 
           //of the String. 
	       
	       //boolean startsWith(String str, index fromIndex): 
	       //It returns true if the String begins with str, it starts looking from 
	       //the specified index “fromIndex”.  For example lets say that the value of the String s is “Hi there” and 
	       //we are calling starsWith() method like this – s.startsWith(“there”, 3) 
	       //then this will return true because we have passed value 3 as fromIndex, 
	       //the searching of keyword “there” begins from the index 3 of the given 
	       //string s and it is found at the beginning of the string s.
	       
	       String str= new String("quick brown fox jumps over the lazy dog");
	       System.out.println("String str starts with quick: "+str.startsWith("quick"));
	       System.out.println("String str starts with brown: "+str.startsWith("brown"));
	       System.out.println("substring of str(starting from 6th index) has brown prefix: "
	+str.startsWith("brown", 6));
	       System.out.println("substring of str(starting from 6th index) has quick prefix: "
	+str.startsWith("quick", 6));

	       
	       System.out.println("*******************");

			// *********endsWith()**********\\
	       
	        
	        String s8="java by javatpoint";  
	        System.out.println(s8.endsWith("t"));  
	        System.out.println(s8.endsWith("point"));  
	        
	       
	       
	       System.out.println("*******************");

			// *********subSequence()**********\\
	       
	       
	       //the only difference between substring() and subsequence()  methods is 
	       //the return type. One returns a String and the other returns a CharSequence.
	       
	        String Str = "Welcome to geeksforgeeks"; 
	       
	        // prints the subsequence from 0-7, exclusive 7th index 
	        System.out.print("Returns: "); 
	        System.out.println(Str.subSequence(0, 7)); 
	  
	        System.out.print("Returns: "); 
	        System.out.println(Str.subSequence(10, 24));
	       
	       
	       
	}

}
