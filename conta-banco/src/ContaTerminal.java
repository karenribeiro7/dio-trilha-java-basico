import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       int numero;
       String agencia, nomeCliente;
       double saldo;
       
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o número da conta: "); 
       numero = scanner.nextInt();

       System.out.println("Digite o número da agência: ");
       agencia = scanner.next();

       System.out.println("Digite o saldo da conta: ");
       saldo = scanner.nextDouble();
       
       System.out.println("Digite o nome do cliente: ");
       nomeCliente = scanner.next();

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
