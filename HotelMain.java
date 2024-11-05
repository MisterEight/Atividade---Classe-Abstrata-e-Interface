import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de acomodação: (1) Quarto Simples, (2) Quarto Duplo, (3) Suíte");
        int tipoAcomodacao = scanner.nextInt();

        System.out.print("Informe a quantidade de dias: ");
        int dias = scanner.nextInt();

        System.out.print("Informe o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        Acomodacao acomodacao;

        switch (tipoAcomodacao) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new Suite();
                break;
            default:
                System.out.println("Tipo de acomodação inválido.");
                scanner.close();
                return;
        }

        acomodacao.exibirDetalhes(dias, numPessoas);
        scanner.close();
        
    }
    
}
