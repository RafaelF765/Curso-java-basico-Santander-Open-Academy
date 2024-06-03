
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int opt = 0;
        while (opt != 1){
            System.out.println("_______________________");
            System.out.println("*** Conta Terminal ***");
            System.out.println("_______________________");
            System.out.println("Você deseja abrir uma conta com a gente S para sim N para não?");
            String resposta;
            try (Scanner escolha = new Scanner(System.in)) {
                resposta = escolha.next();
                
            
            if(resposta.equals("s")){
                System.out.println("Número da conta: ");
                int numero =escolha.nextInt();
                
                
                System.out.println("Digite sua Agência: ");
                String agencia = escolha.next();
              

                System.out.println("Nome Completo: ");
                String nome = escolha.next();
               
                escolha.nextLine();
                System.out.println("Primiro depósito: ");
                double saldo = escolha.nextFloat();
                escolha.close();

                
                ContaTerminal conta1 = new ContaTerminal(numero, agencia, nome, saldo);
                conta1.apresentarDados();
                opt = 1;
            
            }else{
                opt = 1;
            }
            }
    }
    }
}
