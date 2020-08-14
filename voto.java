import java.util.Scanner;

public class voto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = in.nextInt();

        if (idade >= 16 && idade <= 17) {
            System.out.println("Voto facultativo");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Voto Obrigatório");
        } else if (idade <= 15) {
            System.out.println("Você não pode votar");


        }

    }
}


