package stringExample;

import java.util.Arrays;

public class stringExamples {
	public static void main(String[] args) {
		
		String name = "Swaroop Krishna";
		char[] charatcterArray = name.toCharArray();
		
		System.out.println(Arrays.toString(charatcterArray));
		
		String name1 = "Ashish Thakur";
		String [] name1Array = name1.split(" ");
		
		System.out.println("First Name = " + name1Array[0]);
		System.out.println("Last Name = " + name1Array[1]);
		System.out.println(Arrays.toString(name1Array));
		
		String line1 = "This,is,java,class";
		String [] line1Array = line1.split(",");
		System.out.println(Arrays.toString(line1Array));
		
		String name2 = "Arshpreet";
		
		System.out.println("Changed Name = " + name2.replace("preet", "deep"));
		
		System.out.println("Index of letter p : " + name2.indexOf("p"));
		System.out.println("Index of letter e: " + name2.indexOf("e"));
		
		String email = "abcdefgh@email.com";
		if (email.contains("@")){
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invalid");
 		}
		
		System.out.println("Email domain :" + email.substring(5));
		
		System.out.println("Email domain : " + email.substring(email.indexOf("@")));
		System.out.println("Email domain : " + email.substring(email.indexOf("@") + 1));
		System.out.println("Name is email : " + email.substring(0, email.indexOf("@")));
		
		
		
	}

}
