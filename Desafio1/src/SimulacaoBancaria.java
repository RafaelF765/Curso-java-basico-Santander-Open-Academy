import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valor = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem vindo, digite o número da opção corresponte a operação que deseja realizar");
            System.out.println("1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n0 - Encerrar");
          
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Qual valor do depósito?");
                     valor = scanner.nextDouble();
                    if(valor >= 0){
                      saldo += valor;
                      System.out.println("Saldo atual: R$ "+ String.format("%.1f",saldo));
                    }else{
                      System.out.println("Por favor digite um valor válido");
                    }
                    
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual valor do saque?");
                    valor = scanner.nextDouble();
                    if(valor <= saldo){
                      saldo -= valor;
                      System.out.println("Saldo atual: R$ "+ String.format("%.1f",saldo));
                    }else{
                      System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: R$ "+ String.format("%.1f",saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    
}