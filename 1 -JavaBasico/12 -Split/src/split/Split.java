
package split;


public class Split {

    
    public static void main(String[] args) {
        
        String s = "Lincoln Costa Silva";
        
        String[] vect = s.split(" ");
       
        String nome1 = vect[0];
        String sobrenome1 = vect[1];
        String sobrenome2 = vect[2];
        
        System.out.println(nome1);
        System.out.println(sobrenome1);
        System.out.println(sobrenome2);
        
        
        
    }
    
}
