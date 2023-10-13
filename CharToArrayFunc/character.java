public class character {
    public static void main(String[] args)
    {
        System.out.println(Character.isLetter('A'));       	  
        System.out.println(Character.isLetter('0'));      		  
        System.out.println(Character.isDigit('A')); 		
        System.out.println(Character.isDigit('0'));      	
        System.out.println(Character.isUpperCase('a'));		
        System.out.println(Character.isUpperCase(65));	
        System.out.println(Character.isLowerCase('D'));		
        System.out.println(Character.isLowerCase(97));	
        System.out.println(Character.isWhitespace('A'));		
        System.out.println(Character.isWhitespace(' '));	
        System.out.println(Character.isWhitespace('\n'));	
        System.out.println(Character.isWhitespace('\t'));		
	    System.out.println(Character.toString('x'));          	  
    }
}
