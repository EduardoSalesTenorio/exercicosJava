/*
Crie um programa que receba como parâmetro um valor em reais e converta para
dólares (Estados Unidos) e yenes (Japão). Use um formatador de números
apropriado para imprimir o resultado, levando o locale em consideração. 
Se não tiver como obter a cotação do dia, use R$ 1 = US$ 0,45 e R$ 1 = ¥ 45,25.
 */
package onze;

import java.util.Scanner;

/**
 * @author Eduardo Sales
 */
public class Onze {

    public static void main(String[] args) {

        double entrada;
        Scanner entra = new Scanner(System.in);

        System.out.println("Digite o valor do dinheiro: ");
        entrada = entra.nextDouble();

        System.out.println("Valor em Dolares é de: US$" + (entrada * 0.45));
        System.out.println("Valor em Yenes é de: ¥" + (entrada * 45.25));
    }

}
