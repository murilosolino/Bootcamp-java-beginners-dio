package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int contador = 0;
        int numero;
        int quantImpares =0, quantPares = 0;

        System.out.println("Quantidade de números:  ");
        quantNumeros = scanner.nextInt();

        do
        {
            System.out.println("Numero:");
            numero = scanner.nextInt();

            if (numero %2 == 0) quantPares ++;
            else quantImpares++;

            contador = contador + 1;
        }
        while(contador < quantNumeros);

        System.out.println("Quantidade Par:  " + quantPares);
        System.out.println("Quantidade Impar:  " + quantImpares);


    }
}
