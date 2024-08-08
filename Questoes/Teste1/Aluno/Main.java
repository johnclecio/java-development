package Questoes.Teste1.Aluno;

import Questoes.Teste1.Fibonacci;
import Questoes.Teste1.FormasGeometricas.Formas;
import Questoes.Teste1.MediaTotal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int op = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha as Atividades: ");
            System.out.println("Digite 1: sequência fibonacci");
            System.out.println("Digite 2: Escreva um código onde o usuário pode digitar quantos números quiser, \ne ao digitar 0, será exibido a soma e média de todos os números digitados além de exibir o maior e menor número.");
            System.out.println("Digite 3: Informações do aluno");
            System.out.println("Digite 4 Forma geométrica");
            System.out.println("Digite 5 para sair");

                op = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (op) {
                    case 1:
                        Fibonacci.gerarSequenciaFibonacci();
                        break;
                    case 2:
                        MediaTotal.SuaMedia(scanner);
                        break;
                    case 3:
                        Aluno aluno = new Aluno();

                        System.out.print("Digite o nome do aluno: ");
                        aluno.setNome(scanner.nextLine());

                        System.out.print("Digite a idade do aluno: ");
                        aluno.setIdade(scanner.nextInt());

                        System.out.print("Digite a nota 1: ");
                        aluno.setNota1(scanner.nextDouble());

                        System.out.print("Digite a nota 2: ");
                        aluno.setNota2(scanner.nextDouble());

                        System.out.print("Digite a nota 3: ");
                        aluno.setNota3(scanner.nextDouble());

                        aluno.Descricao();
                        break;
                    case 4:
                        Formas.Start(scanner);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                }

        } while (op != 5);
    }
}