import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite seu login: ");
        String login = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (senha.length() >= 8) {
            System.out.println(" Senha precisa ter no minimo 8 caracteres");


            int contador = 0;

            while(contador <senha.length()) {
                System.out.println(senha.charAt(contador));

                String caracter = String.valueOf(senha.charAt(contador));

                if (caracter.equals("#")) {
                    System.out.println("Senha Valida");

                }else{
                    System.out.println("Senha invalida");


                }
                contador++;

            }


        }

    }

}




