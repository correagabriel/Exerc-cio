package Scan;

import java.util.Scanner;

public class testandoscann {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //criar e chamar a classe scanner e estanciamos u m objeto

        System.out.println("Digite o seu nome : ");
            String nome = scanner.next(); //chamando o nome

            System.out.println("Hello, " + nome);

    }
}
