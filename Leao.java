import java.util.Scanner;

public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = "Leão";
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = 4; // Leões têm 4 patas
        this.quantidadeAsas = 0; // Leões não têm asas
        this.envergaduraAsas = 0;
        this.altura = altura;
        this.peso = peso;
    }

    public void comer() {
        // Implementação para alterar o estado comidaIngerida
    }

    public void andar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância andada pelo Leão: ");
        int distanciaAndada = scanner.nextInt();
    }

    public void dormir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas dormidas pelo Leão: ");
        int horasDormidas = scanner.nextInt();
    }

    public void scanComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de comida ingerida pelo Leão: ");
        int comidaIngerida = scanner.nextInt();
    }
}



