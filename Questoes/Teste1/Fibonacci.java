package Questoes.Teste1;//1. Escreva um código que receba como entrada um número inteiro e gere a sequência fibonacci até a posição apontada pelo número.


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número ");
        int n = scanner.nextInt();


        int sequenciaFibonacci = 1;
        int antes = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Questoes.Teste1.Fibonacci(" + i + ") = " + sequenciaFibonacci);
            int fibo = sequenciaFibonacci;
            sequenciaFibonacci = sequenciaFibonacci + antes;
            antes = fibo;


        }


    }
}






