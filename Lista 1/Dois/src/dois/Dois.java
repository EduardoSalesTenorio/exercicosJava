/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escreva um algoritmo que leia o custo de fábrica de um carro e escreva o custo
ao consumidor.
*/
package dois;

import java.util.Scanner;

/**
 * @author Eduardo Sales
 */
public class Dois {

    public static void main(String[] args) {
       double custoFabrica;
       double resultado;
       
       Scanner escrever = new Scanner(System.in);
       
       custoFabrica = escrever.nextDouble();
       
       resultado = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
       
        System.out.println("Custo Final: " + resultado);
    }
    
}
