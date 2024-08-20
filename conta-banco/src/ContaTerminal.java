import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
     Scanner teclado = new Scanner(System.in);

       //Exibir as mensagens para o nosso usuário
       System.out.println(" Por favor, digite o número da Agência!");
       
       //Obter pela scanner os valores digitados no terminal
       String agencia = teclado.nextLine();
       System.out.println("Digite o número da conta:");
       int conta = teclado.nextInt();
       System.out.println("Digite o nome do cliente:");
       String nomeCliente = teclado.next();

       //Exibir mensagem conta criada
       double saldo = 100.00;

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        
    }
}
