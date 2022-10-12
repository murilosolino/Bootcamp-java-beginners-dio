import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       


        // Calculadora 
        int numero1;
        int numero2;

        System.out.println("Calculadora");
        System.out.println("Insira os dois numeros que deseja:");
        numero1 = scanner.nextInt();
        numero2 = scanner. nextInt();
        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);

        // Mensagem 

        int hora;
        System.out.println("Insira a hora que deseja");
        hora = scanner.nextInt();
        Mensagem.obterMensagem(hora);
    
        // Empréstimo

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
