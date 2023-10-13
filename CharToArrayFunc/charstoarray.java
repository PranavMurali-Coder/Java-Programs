class charstoarray {
public static void main(String args[])
    {
        String s = "Hello";
        char[] g = s.toCharArray();
        for (int i = 0; i < g.length; i++) {
        System.out.println(g[i]);
        String str = "Welcome! to VELLORE";		
        char[] destArray = new char[20];				
        str.getChars(12, 19, destArray, 0);			
        System.out.println(destArray);
        }
        System.out.println();
    }
}
   

