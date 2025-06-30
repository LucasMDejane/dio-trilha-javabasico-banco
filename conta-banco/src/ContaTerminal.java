import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        var conta = scanner.nextInt();
        scanner.nextLine(); //Limpar o buffer de maneira simples

        System.out.println("Por favor, digite a Agência: ");
        var agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu primeiro e último nome: ");
        var nome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque", nome, agencia, conta, saldo );

        scanner.close();
    }
}
