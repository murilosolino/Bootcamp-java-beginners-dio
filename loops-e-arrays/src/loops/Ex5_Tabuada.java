package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada:  ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada:  " + tabuada);

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
        }
    }
}
