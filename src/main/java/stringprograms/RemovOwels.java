package stringprograms;

import java.util.Scanner;

public class RemovOwels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words");
		String inputString = sc.nextLine();
		
		String ch =inputString.toLowerCase().replaceAll("[aeiou]",""); 
				
		System.out.println(ch);

	}

}
