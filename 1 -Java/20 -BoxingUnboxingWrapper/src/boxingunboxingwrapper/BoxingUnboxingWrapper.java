package boxingunboxingwrapper;


public class BoxingUnboxingWrapper {

    public static void main(String[] args) {
        
        int x = 20;
        
        Object obj = x;
        
        System.out.println(obj);
        
        int y = (int)obj;
        
        int soma = y + 5;
        
        System.out.println(soma);
    }
    
}
