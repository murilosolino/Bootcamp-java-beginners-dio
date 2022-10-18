package Poo.Interface;

public class Calcula implements OperacaoMatematica {

    @Override
    public void soma (int numero1, int numero2){
        System.out.println("Soma:  " + numero1 + numero2);
    }
    @Override
    public void subtracao (int numero1, int numero2){
        System.out.println("Subtração:  " + (numero1 - numero2));
    }
    @Override
    public void divisao (int numero1, int numero2){
        System.out.println("Divisão:  " + (numero1 / numero2));
    }
    @Override
    public void multiplicacao (int numero1, int numero2){
        System.out.println("Multiplicação:  " + (numero1 * numero2));
    }
    
}
