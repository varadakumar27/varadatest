package stringprograms;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class SubStringwithoutdup {

	public static void main(String[] args) 
    {    
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String");
     String longestSubstring=sc.nextLine();
     
         
        
         
    	//("javaconceptoftheday"); longestSubstring ("thelongestsubstring");
	 
   String longestSubstring1 = longestSubstring.replace("//s"," ");
        //Convert inputString to charArray
	         
	        char[] charArray = longestSubstring1.toCharArray();
	         
	        //Initialization
	         
	       
	         
	        int longestSubstringLength = 0;
	         
	        //Creating LinkedHashMap with characters as keys and their position as values.
	         
	        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
	         
	        //Iterating through charArray
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            char ch = charArray[i];
	         
	            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
	             
	            if(!charPosMap.containsKey(ch))
	            {
	                charPosMap.put(ch, i);
	            }
	             
	            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
	             
	            else
	            {    
	                i = charPosMap.get(ch);
	                 
	                charPosMap.clear();
	            }
	             
	            //Updating longestSubstring and longestSubstringLength
	             
	            if(charPosMap.size() > longestSubstringLength)
	            {
	                longestSubstringLength = charPosMap.size();
	                 
	                longestSubstring1 = charPosMap.keySet().toString();
	            }
	        }
	         
	        System.out.println("Input String : "+longestSubstring);
	         
	        System.out.println("The longest substring : "+longestSubstring1);
	         
	        System.out.println("The longest Substring Length : "+longestSubstringLength);
	    }
	     
	    
	    }    
	


