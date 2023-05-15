import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1 - Passar na catraca");
            System.out.println("2 - Listar eventos");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código digital: ");
                    String codigo = scanner.next();
                    scanner.nextLine();

                    controleAcesso.registrarCodigoDigital(codigo);
                    break;
                case 2:
                    controleAcesso.listarEventos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
