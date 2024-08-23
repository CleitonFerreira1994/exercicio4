import java.util.Scanner;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsas) {
        this.nome = nome;
        this.tipoAnimal = "Pombo";
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = 2; // Pombos têm 2 patas
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.altura = altura;
        this.peso = peso;
    }

    public void comer() {
        // Implementação para alterar o estado comidaIngerida
    }

    public void voar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância voada pelo Pombo: ");
        int distanciaVoo = scanner.nextInt();
    }

    public void dormir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas dormidas pelo Pombo: ");
        int horasDormidas = scanner.nextInt();
    }

    public void scanComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de comida ingerida pelo Pombo: ");
        int comidaIngerida = scanner.nextInt();
    }
}


