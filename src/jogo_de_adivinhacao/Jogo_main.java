package jogo_de_adivinhacao;
import java.util.Scanner;
import java.util.Random;

public class Jogo_main {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAle = gerador.nextInt(100)+1;

        int tentativas = 5;

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
        *******************************
        Jogo da adivinhação
        *******************************
        """);

        // Loop para controlar o número de tentativas
        for (int i = 0; i < tentativas; i++) {
            System.out.println("Qual o número misterioso?");
            int chute = entrada.nextInt();

            if (chute == numeroAle) {
                System.out.println("Parabéns! Você acertou o número misterioso.");
                break;
            } else if (chute > numeroAle) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Tente um número maior!");
            }
        }
        entrada.close(); // fecha a entrada de dados
        System.out.println("O número misterioso era: " + numeroAle);
    }
}
