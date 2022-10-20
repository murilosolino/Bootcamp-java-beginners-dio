package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Comparable;

public class OrdenacaoList {
    /*Dados as seguintes informações sobre cães, crie uma lista 
     e orde a lista por (nome-idade-cor)

    Cachorro 1 = nome: Kiara idade: 2 anos Cor: preto
    Cachorro 2 = nome: jon idade: 1 anos Cor: branco
    Cachorro 1 = nome: Kiara idade: 3 anos Cor: malhado
    


     */

     public static void main(String[] args) {
        

        List<Cachorro> cachorros = new ArrayList<>(){{

            add(new Cachorro("Kiara", 2, "preto"));
            add(new Cachorro("Jon", 1, "branco"));
            add(new Cachorro("Kiara", 3, "malhado"));

        }};
        // Ordem de Inserção
        System.out.println(cachorros);

        //Ordem aleatória
        Collections.shuffle(cachorros);
        System.out.println(cachorros);

        //Ordem natural
        Collections.sort(cachorros);
        System.out.println(cachorros);

        //Ordem de idade
        Collections.sort(cachorros, new ComparadorIdade() );
        System.out.println(cachorros);

        //Ordem de cores
        Collections.sort(cachorros, new ComparadorCor() );
        System.out.println(cachorros);



     }
}

 class Cachorro implements Comparable<Cachorro> {
    
    private String nome;
    private Integer idade;
    private String cor;
    
    public Cachorro(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
            
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "{"+ "nome = " + nome + " / " + " idade = " + idade + " cor =  " + cor + " / " + "}";
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
}


class ComparadorIdade implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        // TODO Auto-generated method stub
        return  Integer.compare(c1.getIdade(), c2.getIdade());
    }
    
}

class ComparadorCor implements Comparator<Cachorro> {

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        // TODO Auto-generated method stub
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }}

