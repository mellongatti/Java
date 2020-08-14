import java.util.Scanner;

public class voto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        if (idade >= 16 && idade <= 17) {
            System.out.println("Voto facultativo");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Voto obrigatório!");
        } else if (idade <16) {
            System.out.println("Você não pode votar :(");
        }
    }
}
