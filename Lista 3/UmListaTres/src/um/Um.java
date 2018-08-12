/*
Fazer uma classe Ex1Primos para:
• Receber um inteiro N do usuário
• Testar se este inteiro é primo ou não e informar
 */
package um;

import java.util.Scanner;

/**
 * @author Eduardo Sales
 */
public class Um {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Entrada: ");
        n = entrada.nextInt();

        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                System.out.println("Não é primo!!!");
                System.exit(0);
            }
        }
        System.out.println("É primo!!!");
    }

}
