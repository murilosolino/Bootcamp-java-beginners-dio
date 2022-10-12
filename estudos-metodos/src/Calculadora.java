public class Calculadora {
    
    public static void soma(int numero1, int numero2) {
        
        float resultado = numero1 + numero2;

        System.out.println("A soma de  " + numero1 + "mais  " + numero2 + "é de:  " + resultado);
    }

    public static void subtracao(float numero1, float numero2) {
        
        float resultado = numero1 - numero2;

        System.out.println("A subtração de  " + numero1 + "mais  " + numero2 + "é de:  " + resultado);
    }

    public static void multiplicacao(float numero1, float numero2) {
        
        float resultado = numero1 * numero2;

        System.out.println("A multiplicação de  " + numero1 + "mais  " + numero2 + "é de:  " + resultado);
    }

    public static void divisao(float numero1, float numero2) {
        
        float resultado = numero1 / numero2;

        System.out.println("A divisão de  " + numero1 + "mais  " + numero2 + "é de:  " + resultado);
    }
}
