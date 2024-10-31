import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartaoDeCredito c = new CartaoDeCredito(123321, "Luciano Bastos");
        c.setCpf("12345543210");

        c.alterarLimite(1000);
        c.setTaxaCashBack(0.05);

        int opcao = 1;

        do {
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar compra");
            System.out.println("4 - Realizar compra com o cashback");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    c.consultarLimite();
                    break;
                case 2:
                    c.consultarTotalFatura();
                    break;
                case 3:
                    System.out.println("Digite o valor da compra:");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                case 4: 
                    System.out.println("Digite o valor da compra:");
                    double cashBack = sc.nextDouble();
                    c.realizarCompra(cashBack, true);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
