package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;

       do{
        System.out.println("Numero:");
        numero = scanner.nextInt();

        soma = soma + numero;
        

        if (numero > maior) maior = numero;

        contador = contador + 1;
       }
       while(contador < 5);

       System.out.println("Maior:  " + maior);
       System.out.println("Media:  " + (soma/5));

    }
}
