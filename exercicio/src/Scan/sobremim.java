package Scan;
import java.util.Scanner;

public class sobremim {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String nome = args[0]; //argumentos 
        Integer idade = Integer.valueOf(args[1]);
        float altura = Float.valueOf(args[2]);
        String filme = args[3];
        
        /*System.out.println("Digite o seu nome : ");
        String nome = scanner.next(); //chamando o nome

        System.out.println("Digite a sua idade : ");
        Integer idade = scanner.nextInt();

        System.out.println("Digite a sua altura : ");
        Float altura = scanner.nextFloat();

        System.out.println("Digite a seu filme fav  : ");
        String filme = scanner.next(); */

        System.out.println("Hello, " + nome);
        System.out.println("Sua idade : " + idade);
        System.out.println("Sua altura :  " + altura);
        System.out.println("Filme favorito : " + filme);

    }
}
