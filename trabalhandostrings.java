import java.util.Scanner;

// SENHA COM 8 OU = CARACTERES - length conta os caracteres
// !=

public class trabalhandostrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite uma senha");
//
//        String senha = scanner.nextLine();

//        if (senha.length() < 8){
//            System.out.println("Senha precisa ter no minimo 8 caracteres");
//        }
//        else {
//            System.out.println("Tudo certo");
//        }

     //   >= 16 <= 17 --> Facultativo
       // &&  - significa "E"
       // == operador de igualdade

        System.out.println("Digite uma idade");

        int idade = scanner.nextInt();

        if(idade >=16 && idade <=17) {
            System.out.println("Voto Facultativo");
        } else if (idade >= 18 && idade <=60){
            System.out.println("Voto obrigatório");
        } else if (idade <=15){
            System.out.println("Voce não pode votar");
        }

    }
}

#src
