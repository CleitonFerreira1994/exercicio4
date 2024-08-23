import java.util.Scanner;

public class Cachorro extends AnimalAB {
    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public void comer() {
        // Implementação para alterar o estado comidaIngerida
    }

    public void moverse() {
        // Implementação para alterar o estado caminhoPercorrido
    }

    public void dormir() {
        // Implementação para alterar o estado horasDormidas
    }

    public void scanComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de comida ingerida pelo Cachorro: ");
        comidaIngerida = scanner.nextInt();
    }

    public void scanCaminho() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de caminho percorrido pelo Cachorro: ");
        caminhoPercorrido = scanner.nextInt();
    }

    public void scanHoras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas dormidas pelo Cachorro: ");
        horasDormidas = scanner.nextInt();
    }
}
