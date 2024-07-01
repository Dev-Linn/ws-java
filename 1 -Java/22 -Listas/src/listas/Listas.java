package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        
        Demo
                • Tamanho da lista: size()
                • Obter o elemento de uma posição: get(position)
                • Inserir elemento na lista: add(obj), add(int, obj)
                • Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
                • Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
                • Filtrar lista com base em predicado:
                List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
                • Encontrar primeira ocorrência com base em predicado:
                Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
              
        
         */
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria"); // 0
        list.add("bob"); // 1
        list.add("Ana"); // 2
        list.add("Lincoln"); // 3
        list.add(2, "Marco");
        
        
        
        System.out.println();
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println();
        
        for (String x : list){
            System.out.println(x);
        }
        
        System.out.println("---------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // pega um valor x do tipo string e me retorna se esse x.charAt(0) é igual a 'M' isso é um predicado
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("---------------------------------------");
        //Encontrar a posição do elemento
        
        System.out.println("Index of bob: " + list.indexOf("bob"));
        System.out.println("Index of bob: " + list.indexOf("carlinhos"));
        
        System.out.println("---------------------------------------");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        
         System.out.println("---------------------------------------");
         
         String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
         
        
        sc.close();
    }

}
