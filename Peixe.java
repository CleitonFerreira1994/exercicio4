import java.util.Scanner;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = "Peixe";
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = 0; // Peixes não têm patas
        this.quantidadeAsas = 0; // Peixes não têm asas
        this.envergaduraAsas = 0;
        this.altura = altura;
        this.peso = peso;
    }

    public void comer() {
        // Implementação para alterar o estado comidaIngerida
    }

    public void nadar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância nadada pelo Peixe: ");
        int distanciaNadada = scanner.nextInt();
    }

    public void dormir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas dormidas pelo Peixe: ");
        int horasDormidas = scanner.nextInt();
    }

    public void scanComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de comida ingerida pelo Peixe: ");
        int comidaIngerida = scanner.nextInt();
    }
}

