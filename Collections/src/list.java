import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args) {
        System.out.println("Crie uma lista com 6 notas.");

        //Criação da lista
         List<Double>  notas = new ArrayList<>();

         // Adicionando valores à lista

         /*=========================================
          Posições começam a contar a partir do 0
          =======================================*/
         notas.add(10.0); // - posição 0
         notas.add(2.0);  // -  posição 1
         notas.add(7.6); // - posição 2 
         notas.add(6.6);  // - posição 3
         notas.add(8.8);  // - posição 4
         notas.add(5.7);   // - posição 5     
         
         //imprimindo a lista
            System.out.println(notas);

         //Procurando um determinado valor na lista
            System.out.println("Exiba a posição da nota 8.8:  " + "posição: " + notas.indexOf(8.8));

         // Add uma nota numa determinada posição
            System.out.println("Adiciona na lista a nota 6.0 na posição 2: ");
            notas.add(2, 6.0);
            System.out.println(notas);

         // Substituindo o valor de uma posição na lista
            System.out.println("Substitua a nota 8.8 pela nota 9.0:");
            notas.set(notas.indexOf(8.8), 9.0);
            System.out.println(notas);

         // Conferindo se um objeto está dentro da lista "notas.constains" retornará um boolenao como resposta.
                //TRUE
            System.out.println("Confira se a nota 7.6 está dentro da lista: " + notas.contains(7.6));
                //FALSE
            System.out.println("Confira se a nota 3.6 está dentro da lista: " + notas.contains(3.6));

        //Procurando um valor por determinada posição
        System.out.println("Mostre a 2ª nota inserida na lista: " + notas.get(2));
        
        // para exibir o menor valor na lista
        System.out.println("Exiba a menor nota da lista: " + Collections.min(notas));

         // para exibir o maior valor na lista
         System.out.println("Exiba a maior nota da lista: " + Collections.max(notas));

         //para exibir a soma dos valores
         System.out.println("Exiba a soma dos valores: ");
         Iterator<Double> iterator = notas.iterator();
         Double soma = 0.0;
         while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
         }
         System.out.println(soma);

         // Exibir a média dos valores
         System.out.println("Exiba a média das notas" + (soma/notas.size()));

         //Remover algum item da Lista
         System.out.println("Remova a nota 5.7");
         notas.remove(5.7);
         System.out.println(notas);

         // Remover item por posição
         System.out.println("Remova a nota da posiçao 0");
         notas.remove(0);
         System.out.println(notas);

         // Remover todos os itens menores que um número.
         System.out.println("Remova todas a notas menores que 7: ");
          Iterator<Double> iterator2 = notas.iterator();
          while (iterator2.hasNext()){
           Double next = iterator2.next();

           if (next < 7)  iterator2.remove();
        
          }
          System.out.println(notas);

          //Para apagar a lista toda
          System.out.println("Apagar toda a lista: ");
          notas.clear();
          System.out.println(notas);

          // Conferir se a lista está vazia com True or False
          System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
