/*
Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e mostre 
o nome da pessoa mais velha e o nome da pessoa mais nova
*/
package um;

import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
        String[] nome = new String[3];
        int[] idade = new int[3];

        int maior = 0;
        int menor = 0;

        Um a = new Um();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome do usuario");
            nome[i] = entrada.next();

            System.out.println("Idade");
            idade[i] = entrada.nextInt();
        }

        maior = a.maior(idade);
        menor = a.menor(idade);

        System.out.println(nome[maior] + " " + idade[maior]);
        System.out.println(nome[menor] + " " + idade[menor]);
    }

    int maior(int[] idade) {
        int maior = idade[0];
        int cont = 0;

        for (int i = 0; i < idade.length; i++) {

            if (maior < idade[i]) {
                maior = idade[i];
                cont = i;
            }

        }

        return cont;
    }

    int menor(int[] idade) {
        int menor = idade[0];
        int cont = 0;

        for (int i = 0; i < idade.length; i++) {

            if (menor > idade[i]) {
                menor = idade[i];
                cont = i;
            }

        }

        return cont;
    }

}
