//3. Implemente uma classe que represente um aluno, seguindo a descrição abaixo.
// E em seguida o código da questão deve pedir para o usuário preencher essas informações
// e logo após isso exibir o texto {nome_do_aluno: média} e em outra linha informar se o aluno é maior de idade ou não;

//a. Atributos: nome, idade, 3 notas
//b. Métodos: getNome, getMedia e temMaioridade
//i. getNome: retorna o nome do aluno;
//ii. getMedia: Retorna a média das 3 notas do aluno;
//iii. temMaioridade: retorna um bool informando se o aluno tem mais de 18 anos ou não
//c. Implemente a classe com seu devido encapsulamento.

package Questoes.Teste1.Aluno;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1, nota2, nota3;


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String MaiorIdade() {
        return temMaioridade() ? "Você é maior de idade." : "Você é menor de idade.";
    }

    private boolean temMaioridade() {
        if (idade >= 18 ){
            return true;
        }else {
            return false;
        }


    }

    public String Descricao() {
        String descricao = "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" + "Media: " + getMedia() +
                 "\n" + MaiorIdade();

        System.out.println(descricao);
        return descricao;
    }
}
