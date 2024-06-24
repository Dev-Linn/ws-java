
package stringutils;


public class StringUtils {

   
    public static void main(String[] args) {
        
        /* 
        
        Fromatar: ToLowerCase(), toUpperCase(), trim()
        Recortar: substring(inicio), substring(inicio,fim)
        Susbstituir: Replace(char. char) , Replace(string, string)
        Buscar: IndexOf, LastIndexOf
        Recortar string com base no separador: strSplit("")
         */
        
        String original = "abcde FGHIJ ABC abc DEFG";
        
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc" , "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        System.out.println("Original: -" + original + "-");
        System.out.println("Lowercase: -" + s01 + "-");
        System.out.println("UpperCase: -" + s02 + "-");
        System.out.println("Trim: -" + s03 + "-");
        System.out.println("Substring: -" + s04 + "-");
        System.out.println("Substring: -" + s05 + "-");      
        System.out.println("Replace: -" + s06 + "-"); 
        System.out.println("Replace: -" + s07 + "-"); 
        System.out.println("IndexOf 'bc': -" + i + "-");
        System.out.println("LastIndexOff 'bc': -" + j + "-");
        
    }
    
}
