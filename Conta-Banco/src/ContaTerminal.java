import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int NumeroAgencia;

        String NomeAgencia;

        String NomeCliente;

        float Saldo;

        System.out.println("Por favor, digite o número da Agência:");
        NumeroAgencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome da Agência:");
        NomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        Saldo = scanner.nextFloat();

        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            NomeCliente, NomeAgencia, NumeroAgencia, Saldo
        );

        System.out.println(mensagem);

        scanner.close();
    }
}
