package Questoes.Teste1.Aluno;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        aluno.setNome(scanner.nextLine());

        System.out.println("Digite sua Idade:");
        aluno.setIdade(scanner.nextInt());




        System.out.println("Digite a primeira nota:");
        aluno.setNota1(scanner.nextDouble());

        System.out.println("Digite a segunda nota:");
        aluno.setNota2(scanner.nextDouble());

        System.out.println("Digite a terceira nota:");
        aluno.setNota3(scanner.nextDouble());

        aluno.Descricao();


    }
}
