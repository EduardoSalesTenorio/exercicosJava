/*
Uma pesquisa sobre algumas características físicas da população de uma determinada região
coletou os seguintes dados, referentes a cada habitante, para serem analisados:
- sexo (masculino, feminino)
- cor dos olhos (azuis, verdes, castanhos)
- cor dos cabelos (louros, castanhos, pretos)
- idade em anos.
Para cada habitante, foi perfurado um cartão com esses dados, e o último cartão, que não
corresponde a ninguém, conterá o valor da idade igual a -1. Implementar um algoritmo que
determine e escreva:
a) a maior idade dos habitantes;
b) porcentagem de indivíduos do sexo feminino cuja idade esteja entre 18 e 35 anos, inclusive,
e que tenham olhos verdes e cabelos louros
 */
package tres;

import javax.swing.JOptionPane;

/**
 * @author Eduardo Sales
 */
public class Tres {

    public static void main(String[] args) {

        Tres a = new Tres();

        String[] sexo = {"M", "F", "M", "M", "M", "F", "F", "F", "M", "M"};
        String[] olhos = {"Azuis", "Castanhos", "Verdes", "Castanhos", "Castanhos", "Azuis", "Castanhos", "Verdes", "Castanhos", "Castanhos"};
        String[] cabelos = {"Pretos", "Castanhos", "Loiros", "Loiros", "Castanhos", "Loiros", "Loiros", "Pretos", "Pretos", "Pretos"};
        int[] idade = {4, 61, 19, 33, 20, 31, 90, 30, 27, 24};

        int maior = 0;
        int tamanhoPopulacao = 0;
        int percentual = 0;
        int resultado;

        maior = a.maior(idade);
        JOptionPane.showMessageDialog(null, "Habitante mais velho: " + idade[maior]);

        tamanhoPopulacao = a.tamanho(idade);

        percentual = a.percentual(sexo, olhos, cabelos, idade);

        resultado = (percentual * 100) / tamanhoPopulacao;
        JOptionPane.showMessageDialog(null, "Percentual que atende os requisitos: " + resultado + "%");

    }

    int percentual(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        int cont = 0;

        for (int i = 0; i < sexo.length; i++) {

            if ("M".equals(sexo[i])) {

                if ("Verdes".equals(olhos[i])) {

                    if ("Loiros".equals(cabelos[i])) {

                        if (idade[i] > 18 && idade[i] < 35) {
                            cont++;
                        }
                    }

                }

            }

        }

        return cont;
    }

    int tamanho(int[] tamanhoPopulacao) {

        int cont = 0;
        for (int i = 0; i < tamanhoPopulacao.length; i++) {
            cont++;
        }

        return cont;
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

}
