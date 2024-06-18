import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: "); // Solicitando a informação para o cliente
        int numeroConta = scanner.nextInt(); // granvando a informação digitada na variável

        System.out.println("Por favor, digite o número da Agência! "); // Solicitando a informação para o cliente
        String agencia = scanner.next(); // granvando a informação digitada na variável

        System.out.println("Digite o seu nome: "); // Solicitando a informação para o cliente
        String nomeCliente = scanner.next(); // granvando a informação digitada na variável

        System.out.println("Digite o saldo da conta: "); // Solicitando a informação para o cliente
        double saldo = scanner.nextDouble(); // granvando a informação digitada na variável

        // Imprimindo todas as informações inseridas pelo cliente em uma mensagem
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
