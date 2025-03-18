import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       int numero;
       String agencia;
       String nomeCliente;
       double saldo;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o seu nome:");
       nomeCliente = scanner.nextLine();

       System.out.println("Digite a sua agência:");
       agencia = scanner.nextLine();

       System.out.println("Digite o número da sua agência:");
       numero = scanner.nextInt();

       System.out.println("Digite o seu saldo:");
       saldo = scanner.nextDouble();

       System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");
    }
}
