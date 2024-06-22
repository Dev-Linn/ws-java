package condicaoternaria;


public class Condicaoternaria {

    public static void main(String[] args) {
        
       double preco = 34.5;
       double desconto = (preco < 20.0) ? preco * 01 : preco * 0.5;
       
        System.out.println(desconto);
        
        
        
    }
    
}
