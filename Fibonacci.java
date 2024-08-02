//1. Escreva um código que receba como entrada um número inteiro e gere a sequência fibonacci até a posição apontada pelo número.


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número ");
        int n = scanner.nextInt();
        int sequenciaFibonacci = 0;
        for (int i = 1; i < n; i++) {

            System.out.println("Fibonacci(" + i + ") = " + sequenciaFibonacci(i));

        }


    }

    private static int sequenciaFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return sequenciaFibonacci(n - 1) + sequenciaFibonacci(n - 2);
        }
    }


}
