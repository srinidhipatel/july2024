
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sName = "Hello"; // Special class
		// String is sequence of charchters
		sName="srinidhi";
		System.out.println(sName.length()); // 5 ( 0 - 4)
		System.out.println(sName.toLowerCase());
		System.out.println(sName.toUpperCase());
		System.out.println(sName.indexOf("o"));
		//System.out.println(sName.indexOf(sName.charAt(3)));
		System.out.println(sName.replace('o', 'x'));
		
		// String is immutable --> You cannot change the value
		
		// Concatination abc + def    /t  /n /b
		
		String sText = "abc\b"+"def";
		System.out.println(sText);
		
		//Immutable String is an object which means it is constant --> 
		
		String str1 = "sri";
		String str2 = "Nidhi";
		str2=str1;  //str2= nidhi ---> Lets see what will happen in the back ground 
		String str3= "sri";
		String str20 = "srinidhi";
		String str30 = new String("sri");
		String str40 = new String("sri");
		
		System.out.println("*****************************");		
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
System.out.println("*****************************");
		System.out.println(str30.equals(str40));
		System.out.println(str30==str40);
		
		
		/*
		 * Write a java program to reverse the content of a sentence (Assume a single space between 2 words) without reverse every word
ans also every letter

1-->  input = "Hi I am srinidhi"  output = "srinidhi am I Hi"

2-->  input = "Hi I am srinidhi"  output = "ihdinirs ma I iH"
		 * */
	}

}
