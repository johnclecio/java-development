//4. Faça um código onde o usuário pode escolher entre as formas geométricas quadrado, retângulo e quadrado.
//a. A depender da forma, o usuário irá passar as informações de medidas referente à forma geométrica.
//i. Quadrado: lado;
//ii. Retângulo: base e altura;
//iii. Círculo: raio.
//b. Após informado os dados será exibido a área e o perímetro da forma geométrica.
//c. Se possível faça essa questão utilizando interface para forma geométrica.

package Questoes.Teste1.FormasGeometricas;



import java.util.Scanner;

public class Formas implements FormaGeometrica {




    public static void Start(Scanner scanner) {
        scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha entre as formas geométricas: ");
        System.out.println("Digite 1: Quadrado");
        System.out.println("Digite 2: Retângulo");
        System.out.println("Digite 3: Círculo");
        System.out.println("Digite 4 Menu Principal");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1){
            System.out.print("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            scanner.nextLine();
            Quadrado quadrado = new Quadrado(lado);
            System.out.println("Área: " + quadrado.calcularArea());
            System.out.println("Perímetro: " + quadrado.calcularPerimetro());
        }else if (opcao == 2) {
            System.out.print("Digite a base do retângulo: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            Retangulo retangulo = new Retangulo(base, altura);
            System.out.println("Área: " + retangulo.calcularArea());
            System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        }else if ( opcao == 3){
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            scanner.nextLine();
            Circulo circulo = new Circulo(raio);
            System.out.println("Área: " + circulo.calcularArea());
            System.out.println("Perímetro: " + circulo.calcularPerimetro());
        }else if (opcao == 4){
            System.out.println("Volta para Menu principal");
        }else{
            if (opcao >= 5 || opcao <= 0){
                System.out.println("Opção inválida. Tente novamente.");
            }
        }


    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}




    class Quadrado implements FormaGeometrica {
        private double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }

        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    }


    class Retangulo implements FormaGeometrica {
        private double base;
        private double altura;

        public Retangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }


    class Circulo implements FormaGeometrica {
        private static final double PI = 3.141592653589793;
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return PI * raio * raio;
        }

        @Override
        public double calcularPerimetro() {
            return 2 * PI * raio;
        }
    }
