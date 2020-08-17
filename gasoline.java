import java.util.Scanner;

public class gasoline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validade = true;
        double a = 2.9;
        double g = 3.3;

        while (validade == true) {

            System.out.println("Gasolina ou Alcool [a/g] ?");
            String combustivel = scanner.nextLine();

            if (!combustivel.equals("g") && !combustivel.equals("a") && !combustivel.equals("G") && !combustivel.equals("A")) {
                System.out.println("Não temos esse combustivel");
                break;
            }

            System.out.println("Qual a quantidade de Gasolina ou Álcool?");
            int qtd = scanner.nextInt();

            if (qtd != 0 && combustivel.equals("g") || combustivel.equals("a") || combustivel.equals("G") || combustivel.equals("A")) {

                if (combustivel.equals("G") || combustivel.equals("g")) {

                    if (qtd <= 20) {
                        double resultado = qtd * 3.30;
                        System.out.println("O valor da sua gasolina é: ");
                        System.out.println(resultado - (resultado * 4) / 100);
                        validade = false;

                    } else {
                        double resultado2 = qtd * 3.30;
                        System.out.println("O valor da sua gasolina é: ");
                        System.out.println((resultado2 - (resultado2 * 6) / 100));
                        validade = false;
                    }

                } else {

                    if (qtd <= 20) {
                        double resultado = qtd * 2.9;
                        System.out.println("O valor da sua alcool é: ");
                        System.out.println(resultado - (resultado * 3) / 100);
                        validade = false;


                    } else {
                        double resultado2 =  qtd * 2.9;
                        System.out.println("O valor da sua alcool é: ");
                        System.out.println((resultado2 - (resultado2 * 5) / 100));
                        validade = false;
                    }
                }
            }

        }
    }
}




