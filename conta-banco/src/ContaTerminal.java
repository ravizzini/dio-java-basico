import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário
        
        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

 
        System.out.println("Informe seu nome: \n");

        nomeCliente = ler.nextLine();

        System.out.println("Informe o número da agência: \n");

        agencia = ler.nextLine();

        System.out.println("Informe o número da conta: \n");

        numero = ler.nextInt();

 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
        

    }
}
