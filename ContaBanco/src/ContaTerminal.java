import java.util.Scanner;

public class ContaTerminal {
    // Atributos
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Método Principal
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.iniciar();
    }

    // Método para iniciar o programa
    public void iniciar() {
        // Criar o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do usuário
        System.out.println("Por favor, digite o numero da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor digite o numero da agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo: ");
        saldo = scanner.nextDouble();

        // Mensagem de exibição final
        String mensagem = "Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, "
                + "sua agencia é: " + getAgencia() + ", conta: " + getNumero() + " e seu saldo: " + getSaldo()
                + " já está disponivel para saque.";

        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }

    // Métodos getters

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
