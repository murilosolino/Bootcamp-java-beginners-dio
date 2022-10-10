package loops.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-7, 6, 44, -18, 43, 58,};
        int contador = 0;


        System.out.println("Vetor:  ");
        while(contador < (vetor.length)) 
        {
            System.out.println(vetor[contador] + " ");
            contador++;
        }

        System.out.println("Vetor Inverso:  ");
        for (int i = (vetor.length - 1); i >= 0; i--) {

            
            System.out.println(vetor[i] + " ");


        }
    }
}
