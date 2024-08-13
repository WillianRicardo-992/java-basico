import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String NomeCliente = scanner.next();

        System.out.println("Digite o numero da Agencia: ");
        int Numero = scanner.nextInt();

        System.out.println("Numero da Conta ");
        String Agencia = scanner.next();

        System.out.println("Digite o saldo ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " , obrigado por criar uma conta em nosso banco, sua agenca é " +
                Agencia + ", Conta " + Numero + " e seu saldo " + Saldo + " já está disponível.");



    }
}
