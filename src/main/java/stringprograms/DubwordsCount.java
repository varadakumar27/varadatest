package stringprograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DubwordsCount {

	public static void main(String[] args) {
		

		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the words u want :");
		String inputstring =sc.nextLine();
		String[] wd =inputstring.toLowerCase().split("");
		HashMap<String,Integer> wordings= new HashMap<String,Integer>();
		
		for(String words : wd){
			
			if (wordings.containsKey(words.toLowerCase())){
				
				wordings.put(words, wordings.get(words)+1);
						
			}
			
			else{
				wordings.put(words, 1);
			}
			
			//System.out.println(wordings);
		}
			Set<String> word = wordings.keySet();
			for(String words: word)
			{
				if(wordings.get(words)>=1){
					 System.out.println(words+" : "+wordings.get(words));
				}
			}
			
		}
		
		
	}


