package SobreCarga;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base;
        int altura;
        int baseMaior;
        int baseMenor;
        int alturaTrapezio;

        System.out.println("Digite a base do quadrado:");
        base = scanner.nextInt();
        System.err.println("Digite a altura do quadrado;");
        altura = scanner.nextInt();
        Quadrilatero.area(base, altura);

        System.out.println("Digite a base maior do Trapézio:");
        baseMaior = scanner.nextInt();
        System.out.println("Digite a base menor do Trapézio:");
        baseMenor = scanner.nextInt();
        System.err.println("Digite a altura do Trapézio:");
        alturaTrapezio = scanner.nextInt();
        Quadrilatero.area(baseMaior, baseMenor, alturaTrapezio);
    }
}
