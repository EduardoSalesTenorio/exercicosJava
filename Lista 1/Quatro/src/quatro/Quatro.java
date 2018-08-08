/*
Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e 
calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem 
informando o saldo médio e o valor do crédito. (use o comando caso-de e não faça
repetições)

Saldo médio Percentual
de 0 a 200 nenhum crédito
de 201 a 400 20% do valor do saldo médio
de 401 a 600 30% do valor do saldo médio
acima de 601 40% do valor do saldo médio
 */
package quatro;

import java.util.Scanner;

/**
 * @author Eduardo Sales
 */
public class Quatro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldoIni = 0;
        double resultado = 0;

        System.out.println("Escreva seu saldo");
        saldoIni = entrada.nextDouble();
        
        if (saldoIni <= 200) {
            System.out.println("Nenhum Credito");
        } else if (saldoIni > 200 && saldoIni <= 400) {
            resultado = saldoIni + (saldoIni * 0.2);
            System.out.println("Seu saldo é de: " + resultado);
        } else if (saldoIni > 400 && saldoIni <= 600) {
            resultado = saldoIni + (saldoIni * 0.3);
            System.out.println("Seu saldo é de: " + resultado);
        } else if (saldoIni > 600) {
           resultado = saldoIni + (saldoIni * 0.4);
            System.out.println("Seu saldo é de: " + resultado);
        }

    }

}
