package JavaProgreams.JavaProgreams;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
    	 
         //1. Using replaceAll() Method
  
         String strWithoutSpace = str.replaceAll("\\s", "8");
  
         System.out.println(strWithoutSpace);  
    }
}
