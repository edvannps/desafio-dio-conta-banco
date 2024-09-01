import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
        System.out.println();
        System.out.println("Digite o número da Conta: (1234)");
        numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: (123-8)");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Informe o saldo atual: ");
        saldo = scanner.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar sua conta em "
                + "nosso banco, sua agência é Ag: %s, "
                + "conta nº: %d e seu saldo atual de R$ %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
