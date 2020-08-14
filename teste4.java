import java.util.Scanner;

public class teste4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = in.nextLine();

        System.out.println("Qual sua idade? ");
        int idade = in.nextInt();

        if (idade >= 16 && idade <= 17) {
            System.out.println("Voto Facultativo");

        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Voto obrigatório");

        } else if (idade <= 15) {
            System.out.println("Voce não pode votar");


        }
    }
}
