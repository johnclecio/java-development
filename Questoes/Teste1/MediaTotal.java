//2. Escreva um código onde o usuário pode digitar quantos números quiser,
// e ao digitar 0, será exibido a soma e média de todos os números digitados
// além de exibir o maior e menor número.
package Questoes.Teste1;

import java.util.Scanner;

public class MediaTotal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = -1;
        double soma = 0;
        double cont = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media = 0;



        while (n != 0) {
            System.out.println("Digite um número:");
            n = scanner.nextInt();

            if (n != 0) {
                soma += n;
                cont++;
                if (n > maior) {
                    maior = n;
                }
                if (n < menor){
                    menor = n ;
                }
            }


        }

            media = soma / cont;
            System.out.println(" Total da Soma " + soma);
            System.out.println(" Media = " + media);
            System.out.println("Maior: "+ maior);
            System.out.println("Menor "+ menor);











    }
}
